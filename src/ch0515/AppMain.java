package ch0515;

public class AppMain {
    public static void main(String[] args) {
        //게시판 만들고
        Board board = new Board();

        //사용자 생성해서
        UserInfo dongmin = new UserInfo("cdm2883@naver.com", "dongmin");
         //사용자가 게시글을 작성하고
        Gallery gallery = new Gallery(dongmin, "good","good choice!");
         //게시판 저장
        board.addGallery(gallery);

//        Gallery[] finds = board.findGalleryByUserEmail("cdm2883@naver.com");
//        for(var g:finds){
//            if(g!= null){
//                System.out.println(g);
//            }
        Comment comment= new Comment(dongmin, "me too");
        gallery.addComment(comment);

        Comment[] findsComment = board.findCommentByUserEmail("cdm2883@naver.com");

        for(var c : findsComment){
            if(c!=null){
                System.out.println(c);
            }
        }

    }
}
