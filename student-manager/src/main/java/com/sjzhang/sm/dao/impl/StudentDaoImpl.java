package com.sjzhang.sm.dao.impl;

import com.sjzhang.sm.dao.StudentDao;
import com.sjzhang.sm.entity.Student;
import com.sjzhang.sm.utils.JdbcUtil;
import com.sjzhang.sm.vo.StudentVo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentDaoImpl
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/23
 **/
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<StudentVo> selectAll() throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT t1.*,t2.class_name,t3.department_name\n " +
                "from t_student as t1\n" +
                "left join t_class as t2\n" +
                "on t1.class_id = t2.id\n" +
                "left join t_department as t3\n" +
                "on t2.department_id = t3.id;";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<StudentVo> list = new ArrayList<>();
        while (rs.next()) {
            StudentVo student = StudentVo.builder()
                    .id(rs.getString("id"))
                    .departmentName(rs.getString("department_name"))
                    .className(rs.getString("class_name"))
                    .studentName(rs.getString("student_name"))
                    .phone(rs.getString("phone"))
                    .gender(rs.getShort("gender"))
                    .avatar(rs.getString("avatar"))
                    .birthday(rs.getDate("birthday"))
                    .address(rs.getString("address"))
                    .build();
            list.add(student);
        }
        rs.close();
        pstmt.close();
        jdbcUtil.closeConnection();
        return list;
    }


    @Override
    public List<StudentVo> getAll() throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT t1.*,t2.class_name,t3.department_name\n " +
                "from t_student as t1\n" +
                "left join t_class as t2\n" +
                "on t1.class_id = t2.id\n" +
                "left join t_department as t3\n" +
                "on t2.department_id = t3.id;";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<StudentVo> list = new ArrayList<>();
        while (rs.next()) {
            StudentVo student = StudentVo.builder()
                    .id(rs.getString("id"))
                    .departmentName(rs.getString("department_name"))
                    .className(rs.getString("class_name"))
                    .studentName(rs.getString("student_name"))
                    .phone(rs.getString("phone"))
                    .gender(rs.getShort("gender"))
                    .avatar(rs.getString("avatar"))
                    .birthday(rs.getDate("birthday"))
                    .address(rs.getString("address"))
                    .build();
            list.add(student);
        }
        rs.close();
        pstmt.close();
        jdbcUtil.closeConnection();
        return list;
    }

    @Override
    public List<StudentVo> selectByDepId(int depId) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT t1.*,t2.class_name,t3.department_name\n " +
                "from t_student as t1\n" +
                "left join t_class as t2\n" +
                "on t1.class_id = t2.id\n" +
                "left join t_department as t3\n" +
                "on t2.department_id = t3.id\n" +
                "WHERE t3.id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, depId);
        ResultSet rs = pstmt.executeQuery();
        List<StudentVo> list = convert(rs);
        pstmt.close();
        jdbcUtil.closeConnection();
        return list;

    }

    @Override
    public List<StudentVo> selectByClassId(int classId) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT t1.*,t2.class_name,t3.department_name\n " +
                "from t_student as t1\n" +
                "left join t_class as t2\n" +
                "on t1.class_id = t2.id\n" +
                "left join t_department as t3\n" +
                "on t2.department_id = t3.id\n" +
                "WHERE t1.class_id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, classId);
        ResultSet rs = pstmt.executeQuery();
        List<StudentVo> list = convert(rs);
        pstmt.close();
        jdbcUtil.closeConnection();
        return list;
    }

    @Override
    public List<StudentVo> selectByKeywords(String keywords) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT t1.*,t2.class_name,t3.department_name\n " +
                "from t_student as t1\n" +
                "left join t_class as t2\n" +
                "on t1.class_id = t2.id\n" +
                "left join t_department as t3\n" +
                "on t2.department_id = t3.id\n" +
                "WHERE t1.student_name LIKE ? OR t1.address LIKE ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, "%" + keywords + "%");
        pstmt.setString(2, "%" + keywords + "%");
        ResultSet rs = pstmt.executeQuery();
        List<StudentVo> list = convert(rs);
        pstmt.close();
        jdbcUtil.closeConnection();
        return list;
    }


    @Override
    public int insertStudent(Student student) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection conn = jdbcUtil.getConnection();
        String sql = "INSERT INTO t_student VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, student.getId());
        pstmt.setInt(2, student.getClassId());
        pstmt.setString(3, student.getStudentName());
        pstmt.setString(4, student.getPhone());
        pstmt.setString(5, student.getAvatar());
        pstmt.setShort(6, student.getGender());
        pstmt.setObject(7, student.getBirthday());
        pstmt.setString(8, student.getAddress());
        int n = pstmt.executeUpdate();
        pstmt.close();
        conn.close();
        return n;
    }

    private List<StudentVo> convert(ResultSet rs) throws SQLException {
        List<StudentVo> list = new ArrayList<> ();
        while (rs.next()) {
            StudentVo student = StudentVo.builder()
                    .id(rs.getString("id"))
                    .departmentName(rs.getString("department_name"))
                    .className(rs.getString("class_name"))
                    .studentName(rs.getString("student_name"))
                    .phone(rs.getString("phone"))
                    .gender(rs.getShort("gender"))
                    .avatar(rs.getString("avatar"))
                    .birthday(rs.getDate("birthday"))
                    .address(rs.getString("address"))
                    .build();
            list.add(student);
        }
        return list;
    }

    @Override
    public int updateStudent(Student student) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection conn = jdbcUtil.getConnection();
        String sql = "UPDATE t_student SET address = ?,phone = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, student.getAddress());
        pstmt.setString(2, student.getPhone());
        pstmt.setString(3, student.getId());
        int n = pstmt.executeUpdate();
        pstmt.close();
        conn.close();
        return n;
    }

    @Override
    public int deleteById(String id) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection conn = jdbcUtil.getConnection();
        String sql = "DELETE FROM t_student WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        int n = pstmt.executeUpdate();
        pstmt.close();
        conn.close();
        return n;
    }

    @Override
    public int countByDepartmentId(int departmentId) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection conn = jdbcUtil.getConnection();
        String sql = "SELECT COUNT(*) FROM t_student t1 \n" +
                "LEFT JOIN t_class t2 \n" +
                "ON t1.class_id = t2.id\n" +
                "LEFT JOIN t_department t3 \n" +
                "ON t2.department_id = t3.id\n" +
                "WHERE t3.id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, departmentId);
        ResultSet rs = pstmt.executeQuery();
        int rowcount = 0;
        if (rs.next()) {
            rowcount = rs.getInt(1);
        }
        rs.close();
        pstmt.close();
        jdbcUtil.closeConnection();
        return rowcount;
    }

    @Override
    public int countByClassId(int classId) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection conn = jdbcUtil.getConnection();
        String sql = "SELECT COUNT(*) FROM t_student  WHERE class_id=? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, classId);
        ResultSet rs = pstmt.executeQuery();
        int rowCount = 0;
        if (rs.next()) {
            rowCount = rs.getInt(1);
        }
        return rowCount;
    }

}