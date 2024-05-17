package com.ohgiraffers.fileupload;

// 업로드 된 파일과 관련한 정보를 모아서 관리하는 DTO
public class FileDTO {

    private String originalFilename;
    private String savedName;
    private String filePath;
    private String fileDescription;

    public FileDTO() {}

    public FileDTO(String originalFilename, String savedName, String filePath, String fileDescription) {
        this.originalFilename = originalFilename;
        this.savedName = savedName;
        this.filePath = filePath;
        this.fileDescription = fileDescription;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public String getSavedName() {
        return savedName;
    }

    public void setSavedName(String savedName) {
        this.savedName = savedName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    @Override
    public String toString() {
        return "FileDTO{" +
                "originalFilename='" + originalFilename + '\'' +
                ", savedName='" + savedName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileDescription='" + fileDescription + '\'' +
                '}';
    }
}
