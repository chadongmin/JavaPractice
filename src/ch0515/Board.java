package ch0515;

public class Board {
    private Gallery[] galleries = new Gallery[3];
    private int GalleryIndex;
    private static Long galleryId = 1L;

    public void addGallery(Gallery gallery){
        gallery.setGalleryId(Board.galleryId++);
        galleries[GalleryIndex++] = gallery;
    }

    //사용자 아이디를 통해 전달된 아이디가 댓글을 단 댓글 리스트를 리턴
    public Comment[] findCommentByUserEmail(String userEmail){
        Comment[] findComments = new Comment[100];
        int findCommentIndex = 0;
        for(var g : galleries){
            if(g!=null){
                for(var c : g.getComments()){
                    if(c != null && c.writeUser().equals(userEmail)){
                        findComments[findCommentIndex++] = c;
                    }
                }
            }
        }
        return findComments;
    }

    public Gallery[] findGalleryByUserEmail(String userEmail){
        Gallery[] findGalleries = new Gallery[100];
        int galleryIndex = 0;
        for(var g:galleries){
            if(g.writeEmail().equals(userEmail)){
                findGalleries[galleryIndex++] = g;
            }
        }
        return findGalleries;
    }

}
