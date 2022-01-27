import com.zby.domain.Student;
import com.zby.service.StudentService;
import com.zby.service.impl.StudentServiceImpl;
import com.zby.util.ServiceFactory;
import com.zby.vo.StudentAndClassroomVo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class test01 {
    public static void main(String[] args) {

        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());

        //测试添加操作
//        Student s = new Student();
//        s.setId("A006");
//        s.setName("周六");
//        s.setAge(66);
//        ss.save(s);

        //测试根据ID查询单条
//        Student s = ss.getById("A006");
//        System.out.println(s);

        //查询所有
//        List<Student> sList = ss.getAll();
//        for (Student s:sList){
//            System.out.println(s);
//        }

        //查询姓名
//        List<Student> sList = ss.getName("周六");
//        for (Student s:sList){
//            System.out.println(s);
//        }

        //查询
//        Student stu = new Student();
//        stu.setName("周日");
//        stu.setAge(7);
//        List<Student> sList = ss.select1(stu);
//        for (Student s:sList){
//            System.out.println(s);
//        }

        //模糊查询：like
//        List<Student> sList = ss.select2("周");
//        for (Student s:sList){
//            System.out.println(s);
//        }

        //查询，测试动态Sql，where标签+if标签
//        Student stu = new Student();
//        stu.setName("周");
//        stu.setAge(6);
//        List<Student> sList = ss.select3(stu);
//        for (Student s:sList){
//            System.out.println(s);
//        }

        //查询，测试动态Sql，foreach标签
//        String strArr[] = {"A001","A002","A003"};
//        List<Student> sList = ss.select4(strArr);
//        for (Student s:sList){
//            System.out.println(s);
//        }

        //测试:多表联查   查询出学生姓名和班级名称
//        List<Map<String,Object>> mapList = ss.select5();
//        for (Map<String,Object> map : mapList){
//            Set<String> set = map.keySet();
//            for (String key : set){
//                System.out.println("key == " + key);
//                System.out.println("value == " + map.get(key));
//            }
//            System.out.println("------------------------------------------");
//
//        }

        /*
            在实际项目开发中，如果需要为前端展现的数据，使用一个domain类型不足以表现出来这些数据
            这时我们可以考虑使用两种技术来实现
            分别为: 使用map以及使用vo

            例如我们现在的需求
                查询出学生和班级所有信息
                得到的结果使用学生的domain或者班级的domian都不能够封装这些结果

                所以我们可以使用map去保存这些信息
                同时我们也可以使用vo类来保存这些信息

                vo指的是创建出来一个类， 这个类中的属性是完全由我们自己去定义，属性会保存所有需要展现的信息
                例如我们现在的这个例子，我们可以使用vo来封装所有与学生和班级相关的信息
         */

        List<StudentAndClassroomVo> voList = ss.select6();
        for (StudentAndClassroomVo vo : voList){
            System.out.println(vo);
        }






    }
}
