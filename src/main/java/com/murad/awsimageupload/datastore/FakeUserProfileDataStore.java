package com.murad.awsimageupload.datastore;

import com.murad.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("6dbd054c-ec2e-4205-a9a4-b8e2330ba49e"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("19b49f01-ac62-4da2-8c1f-fa7b8a5ecafe"), "antoniojunior", null));
    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
