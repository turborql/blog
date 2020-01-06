package club.banyuan;

import club.banyuan.bean.Blog;
import club.banyuan.bean.User;
import club.banyuan.dao.BlogDao;
import club.banyuan.dao.CommentDao;
import club.banyuan.dao.UserDao;
import club.banyuan.service.BlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("club.banyuan.dao")
public class BlogApplication {
//    private static Logger logger = LoggerFactory.getLogger(BlogApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
       /*
        BlogService blogService = context.getBean(BlogService.class);
        Blog blog10 = blogService.findBlog(10);
        logger.debug("{}", blog10);
        UserDao userDao = context.getBean(UserDao.class);
        User user1 = userDao.selectUserByName("aa");
        PageInfo pageInfo = blogService.findBlogsByUser(user1, 0, 10);
        logger.info("{}", pageInfo);
*/
       /* Blog blog = new Blog();
        blog.setAuthor(user1);
        for (int i = 11; i <= 100; i++) {
            String title = "标题" + i;
            blog.setTitle(title);
            String content = "内容";
            for (int j = 0; j < 10; j++)
                content = content + i + " ";
            blog.setContent(content);
            blogService.createBlog(blog);
            System.out.println(blog);
        }*/
    }

}
