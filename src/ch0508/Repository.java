package ch0508;

public class Repository {
    Member[] members = new Member[5];
    public Repository(){
        members[0] = new Member("kevin", 175, 74);
        members[1] = new Member("messi", 160, 68);
        members[2] = new Member("ronaldo", 180, 77);
        members[3] = new Member("sonny", 182, 74);
        members[4] = new Member("dongmin", 178, 85);
/*
        System.out.println(members[1].name);
        System.out.println(members[1].height);
        System.out.println(members[1].weight);*/

    }
    public Member[] findAllMember(){
        return members;
    }
}
