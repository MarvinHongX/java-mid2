package collection.map.ex.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> members = new HashMap<>();

    public void save(Member member) {
        members.put(member.getId(), member);
    }

    public void remove(String id) {
        members.remove(id);
    }

    public Member findById(String id) {
        return members.get(id);
    }

    public Member findByName(String name) {
        for (Member member : members.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }



}
