package makeBoardPractice;

public class Board {
    private Article[] articles = new Article[3];
    private Long ArticleId = 1L;
    private int ArticleIndex = 1;

    public void addArticle(Article article){
        articles[ArticleIndex++] = article;
        setArticleId(ArticleId++);
    }


    public void setArticleId(Long articleId) {
        ArticleId = articleId;
    }

    /*파리미터로 입력받은 유저 이름과 게시글 속성의 유저이름과 같아야 하는데 유저이름을 리턴하는 게터가 있어야함
    userInfo클래스에 getUserId 메소드 작성해서 리턴함



    */
    public Article[] findArticleByUserName(String userName){
        Article[] findArticles = new Article[100];
        int articleIndex = 0;
        for(var a : articles){
            if(a != null && a.getUserName().equals(userName)){
                findArticles[articleIndex++] = a;
            }
        }
        return findArticles;
    }



}

