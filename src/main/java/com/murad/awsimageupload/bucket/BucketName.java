package com.murad.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("murad-image-upload");
    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
