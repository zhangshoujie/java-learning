package com.sjzhang.sm.utils;

import com.sjzhang.sm.vo.StudentVo;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName ExportStudent
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/12/8
 **/
public class ExportExcel {
    public ResultEntity exportStudentExcel(List<StudentVo> list){
        ResultEntity resultEntity =null;
        try{
            //1.创建Excel文档
            HSSFWorkbook workbook= new HSSFWorkbook();
            //2.创建文档摘要
            workbook.createInformationProperties();
            //3.获取文档信息，并配置
            DocumentSummaryInformation dsi =
            workbook.getDocumentSummaryInformation();
            //3.1文档类别
            dsi.setCategory("学生信息");
            //3.2设置文档管理员
            dsi.setManager("tyttpe");
            //3.3设置组织机构
            dsi.setCompany("niit");
            //4.获取再要信息配置
            SummaryInformation si = workbook.getSummaryInformation();
            //4.1设置文档主题
            si.setSubject("学生信息表");
            //4.2设置文档标题
            si.setTitle("学生信息");
            //4.3设置文档作者
            si.setAuthor("tyttpe");
            //4.4设置文档备注
            si.setComments("无");
            //创建Excel表
            HSSFSheet sheet = workbook.createSheet("学生信息表");
            //创建日期显示格式，下面的时间格式是excel表格的时间形式，也可以设置别的，可以在excel中看
            /*HSSFCellStyledateCellStyle=workbook.createCellStyle();
            dateCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));*/
            //创建标题的显示样式
            HSSFCellStyle headerStyle=workbook.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.YELLOW.index);
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            //定义列的宽度，要导出几个属性设几个
            sheet.setColumnWidth(0,5*256);
            sheet.setColumnWidth(1,10*256);
            sheet.setColumnWidth(2,10*256);
            sheet.setColumnWidth(3,10*256);
            sheet.setColumnWidth(4,10*256);
            sheet.setColumnWidth(5,10*256);
            sheet.setColumnWidth(6,10*256);
            sheet.setColumnWidth(7,10*256);
            //5.设置表头
            HSSFRow headerRow = sheet.createRow(0);
            HSSFCell cell1 = headerRow.createCell(0);
            cell1.setCellValue("学号");
            cell1.setCellStyle(headerStyle);
            HSSFCell cell2 = headerRow.createCell(1);
            cell2.setCellValue("姓名");
            cell2.setCellStyle(headerStyle);
            HSSFCell cell3 = headerRow.createCell(2);
            cell3.setCellValue("院系");
            cell3.setCellStyle(headerStyle);
            HSSFCell cell4 = headerRow.createCell(3);
            cell4.setCellValue("班级");
            cell4.setCellStyle(headerStyle);
            HSSFCell cell5 = headerRow.createCell(4);
            cell5.setCellValue("性别");
            cell5.setCellStyle(headerStyle);
            HSSFCell cell6 = headerRow.createCell(5);
            cell6.setCellValue("手机号码");
            cell6.setCellStyle(headerStyle);
            HSSFCell cell7 = headerRow.createCell(6);
            cell7.setCellValue("地址");
            cell7.setCellStyle(headerStyle);
            HSSFCell cell8 = headerRow.createCell(7);
            cell8.setCellValue("出生日期");
            cell8.setCellStyle(headerStyle);
            //6.装数据
            for(int i =0;i<list.size();i++){
                HSSFRow row = sheet.createRow(i + 1);
                StudentVo studentVo = list.get(i);
                try{
                    row.createCell(0).setCellValue(studentVo.getId());
                    row.createCell(1).setCellValue(studentVo.getStudentName());
                    row.createCell(2).setCellValue(studentVo.getDepartmentName());
                    row.createCell(3).setCellValue(studentVo.getClassName());
                    row.createCell(4).setCellValue(FormatUtil.formatGender(studentVo.getGender()));
                    row.createCell(5).setCellValue(studentVo.getPhone());
                    row.createCell(6).setCellValue(studentVo.getAddress());
                    String time= FormatUtil.formatDate(studentVo.getBirthday());
                    row.createCell(7).setCellValue(time);
                }catch(NullPointerException e){

                }
            }
            //这里的*****我是excel表格导出的位置，可以放绝对位置，可以在swing中自己选文件作为参数传进来，这么做的话记得在上面的方法后面加参数
            FileOutputStream fileOut=new FileOutputStream("********");
            workbook.write(fileOut);
            resultEntity=ResultEntity.builder().code(0).message("导出成功").build();
            workbook.close();
            fileOut.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return resultEntity;
    }
}
