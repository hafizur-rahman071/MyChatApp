package com.example.mychat;

public class Users {
    public String userName,status,image,thumb_image;

    public Users(){};
    public Users(String userName, String status, String image,String thumb_image) {
        this.userName = userName;
        this.status = status;
        this.image = image;
        this.thumb_image=thumb_image;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThumb_image(){
        return thumb_image;
    }

    public void setThumb_image(String thumb_image) {
        this.thumb_image = thumb_image;
    }
}
