package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 修改日志接入请求体 */
public class UpdateAccessConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_id")

    private String accessConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_detail")

    private AccessConfigDeatil accessConfigDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_info")

    private AccessConfigHostGroupIdList hostGroupInfo;

    public UpdateAccessConfigRequestBody withAccessConfigId(String accessConfigId) {
        this.accessConfigId = accessConfigId;
        return this;
    }

    /** 日志接入ID
     * 
     * @return accessConfigId */
    public String getAccessConfigId() {
        return accessConfigId;
    }

    public void setAccessConfigId(String accessConfigId) {
        this.accessConfigId = accessConfigId;
    }

    public UpdateAccessConfigRequestBody withAccessConfigDetail(AccessConfigDeatil accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
        return this;
    }

    public UpdateAccessConfigRequestBody withAccessConfigDetail(Consumer<AccessConfigDeatil> accessConfigDetailSetter) {
        if (this.accessConfigDetail == null) {
            this.accessConfigDetail = new AccessConfigDeatil();
            accessConfigDetailSetter.accept(this.accessConfigDetail);
        }

        return this;
    }

    /** Get accessConfigDetail
     * 
     * @return accessConfigDetail */
    public AccessConfigDeatil getAccessConfigDetail() {
        return accessConfigDetail;
    }

    public void setAccessConfigDetail(AccessConfigDeatil accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
    }

    public UpdateAccessConfigRequestBody withHostGroupInfo(AccessConfigHostGroupIdList hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
        return this;
    }

    public UpdateAccessConfigRequestBody withHostGroupInfo(Consumer<AccessConfigHostGroupIdList> hostGroupInfoSetter) {
        if (this.hostGroupInfo == null) {
            this.hostGroupInfo = new AccessConfigHostGroupIdList();
            hostGroupInfoSetter.accept(this.hostGroupInfo);
        }

        return this;
    }

    /** Get hostGroupInfo
     * 
     * @return hostGroupInfo */
    public AccessConfigHostGroupIdList getHostGroupInfo() {
        return hostGroupInfo;
    }

    public void setHostGroupInfo(AccessConfigHostGroupIdList hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAccessConfigRequestBody updateAccessConfigRequestBody = (UpdateAccessConfigRequestBody) o;
        return Objects.equals(this.accessConfigId, updateAccessConfigRequestBody.accessConfigId)
            && Objects.equals(this.accessConfigDetail, updateAccessConfigRequestBody.accessConfigDetail)
            && Objects.equals(this.hostGroupInfo, updateAccessConfigRequestBody.hostGroupInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessConfigId, accessConfigDetail, hostGroupInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessConfigRequestBody {\n");
        sb.append("    accessConfigId: ").append(toIndentedString(accessConfigId)).append("\n");
        sb.append("    accessConfigDetail: ").append(toIndentedString(accessConfigDetail)).append("\n");
        sb.append("    hostGroupInfo: ").append(toIndentedString(hostGroupInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
