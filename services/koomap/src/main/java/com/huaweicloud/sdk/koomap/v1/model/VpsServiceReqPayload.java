package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求体。
 */
public class VpsServiceReqPayload {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private VpsServiceReqPayloadUser user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera")

    private VpsServiceReqPayloadCamera camera;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imu")

    private List<VpsServiceReqPayloadImu> imu = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gps")

    private List<VpsServiceReqPayloadGps> gps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slam")

    private List<VpsServiceReqPayloadSlam> slam = null;

    public VpsServiceReqPayload withUser(VpsServiceReqPayloadUser user) {
        this.user = user;
        return this;
    }

    public VpsServiceReqPayload withUser(Consumer<VpsServiceReqPayloadUser> userSetter) {
        if (this.user == null) {
            this.user = new VpsServiceReqPayloadUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public VpsServiceReqPayloadUser getUser() {
        return user;
    }

    public void setUser(VpsServiceReqPayloadUser user) {
        this.user = user;
    }

    public VpsServiceReqPayload withCamera(VpsServiceReqPayloadCamera camera) {
        this.camera = camera;
        return this;
    }

    public VpsServiceReqPayload withCamera(Consumer<VpsServiceReqPayloadCamera> cameraSetter) {
        if (this.camera == null) {
            this.camera = new VpsServiceReqPayloadCamera();
            cameraSetter.accept(this.camera);
        }

        return this;
    }

    /**
     * Get camera
     * @return camera
     */
    public VpsServiceReqPayloadCamera getCamera() {
        return camera;
    }

    public void setCamera(VpsServiceReqPayloadCamera camera) {
        this.camera = camera;
    }

    public VpsServiceReqPayload withImu(List<VpsServiceReqPayloadImu> imu) {
        this.imu = imu;
        return this;
    }

    public VpsServiceReqPayload addImuItem(VpsServiceReqPayloadImu imuItem) {
        if (this.imu == null) {
            this.imu = new ArrayList<>();
        }
        this.imu.add(imuItem);
        return this;
    }

    public VpsServiceReqPayload withImu(Consumer<List<VpsServiceReqPayloadImu>> imuSetter) {
        if (this.imu == null) {
            this.imu = new ArrayList<>();
        }
        imuSetter.accept(this.imu);
        return this;
    }

    /**
     * imu内参。
     * @return imu
     */
    public List<VpsServiceReqPayloadImu> getImu() {
        return imu;
    }

    public void setImu(List<VpsServiceReqPayloadImu> imu) {
        this.imu = imu;
    }

    public VpsServiceReqPayload withGps(List<VpsServiceReqPayloadGps> gps) {
        this.gps = gps;
        return this;
    }

    public VpsServiceReqPayload addGpsItem(VpsServiceReqPayloadGps gpsItem) {
        if (this.gps == null) {
            this.gps = new ArrayList<>();
        }
        this.gps.add(gpsItem);
        return this;
    }

    public VpsServiceReqPayload withGps(Consumer<List<VpsServiceReqPayloadGps>> gpsSetter) {
        if (this.gps == null) {
            this.gps = new ArrayList<>();
        }
        gpsSetter.accept(this.gps);
        return this;
    }

    /**
     * gps相关信息。
     * @return gps
     */
    public List<VpsServiceReqPayloadGps> getGps() {
        return gps;
    }

    public void setGps(List<VpsServiceReqPayloadGps> gps) {
        this.gps = gps;
    }

    public VpsServiceReqPayload withSlam(List<VpsServiceReqPayloadSlam> slam) {
        this.slam = slam;
        return this;
    }

    public VpsServiceReqPayload addSlamItem(VpsServiceReqPayloadSlam slamItem) {
        if (this.slam == null) {
            this.slam = new ArrayList<>();
        }
        this.slam.add(slamItem);
        return this;
    }

    public VpsServiceReqPayload withSlam(Consumer<List<VpsServiceReqPayloadSlam>> slamSetter) {
        if (this.slam == null) {
            this.slam = new ArrayList<>();
        }
        slamSetter.accept(this.slam);
        return this;
    }

    /**
     * slam相关信息。
     * @return slam
     */
    public List<VpsServiceReqPayloadSlam> getSlam() {
        return slam;
    }

    public void setSlam(List<VpsServiceReqPayloadSlam> slam) {
        this.slam = slam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpsServiceReqPayload that = (VpsServiceReqPayload) obj;
        return Objects.equals(this.user, that.user) && Objects.equals(this.camera, that.camera)
            && Objects.equals(this.imu, that.imu) && Objects.equals(this.gps, that.gps)
            && Objects.equals(this.slam, that.slam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, camera, imu, gps, slam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpsServiceReqPayload {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
        sb.append("    imu: ").append(toIndentedString(imu)).append("\n");
        sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
        sb.append("    slam: ").append(toIndentedString(slam)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
