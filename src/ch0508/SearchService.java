package ch0508;

public class SearchService {
    Repository repository = new Repository();
    public Member findMember(String name){


        Member[] members = repository.findAllMember();

        for(int i = 0; i < members.length;i++){
            if(members[i].name.equals(name)){
                Member member = new Member();

                member.name = members[i].name;
                member.height = members[i].height;
                member.weight = members[i].weight;

                return member;
            }
        }
        return null;
    }
}
