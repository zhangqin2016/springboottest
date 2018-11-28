package spring.boot.test.springboottest.vo;

/**
 * @Auther: admin
 * @Date: 2018/11/28 11:04
 * @Description:
 */
public class TestRespVO {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TestRespVO(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TestRespVO{" +
                "content='" + content + '\'' +
                '}';
    }
}
