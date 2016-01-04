package nick.model;


public class FriendRelation {
    private Integer friendId;

    private Integer friendUser1;

    private Integer friendUser2;

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public Integer getFriendUser1() {
        return friendUser1;
    }

    public void setFriendUser1(Integer friendUser1) {
        this.friendUser1 = friendUser1;
    }

    public Integer getFriendUser2() {
        return friendUser2;
    }

    public void setFriendUser2(Integer friendUser2) {
        this.friendUser2 = friendUser2;
    }
}