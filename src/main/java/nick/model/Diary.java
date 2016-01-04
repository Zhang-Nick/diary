package nick.model;

import java.util.Date;

public class Diary {
    private Integer diaryId;

    private String diaryContent;

    private String diaryPicture;

    private Integer diaryUserBelonged;

    private Date diaryTime;

    private String diaryLocation;

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    public String getDiaryContent() {
        return diaryContent;
    }

    public void setDiaryContent(String diaryContent) {
        this.diaryContent = diaryContent == null ? null : diaryContent.trim();
    }

    public String getDiaryPicture() {
        return diaryPicture;
    }

    public void setDiaryPicture(String diaryPicture) {
        this.diaryPicture = diaryPicture == null ? null : diaryPicture.trim();
    }

    public Integer getDiaryUserBelonged() {
        return diaryUserBelonged;
    }

    public void setDiaryUserBelonged(Integer diaryUserBelonged) {
        this.diaryUserBelonged = diaryUserBelonged;
    }

    public Date getDiaryTime() {
        return diaryTime;
    }

    public void setDiaryTime(Date diaryTime) {
        this.diaryTime = diaryTime;
    }

    public String getDiaryLocation() {
        return diaryLocation;
    }

    public void setDiaryLocation(String diaryLocation) {
        this.diaryLocation = diaryLocation == null ? null : diaryLocation.trim();
    }
}