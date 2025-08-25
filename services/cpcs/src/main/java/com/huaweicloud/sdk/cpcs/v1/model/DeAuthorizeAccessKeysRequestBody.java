package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeAuthorizeAccessKeysRequestBody
 */
public class DeAuthorizeAccessKeysRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_ids")

    private List<String> accessKeyIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    public DeAuthorizeAccessKeysRequestBody withAccessKeyIds(List<String> accessKeyIds) {
        this.accessKeyIds = accessKeyIds;
        return this;
    }

    public DeAuthorizeAccessKeysRequestBody addAccessKeyIdsItem(String accessKeyIdsItem) {
        if (this.accessKeyIds == null) {
            this.accessKeyIds = new ArrayList<>();
        }
        this.accessKeyIds.add(accessKeyIdsItem);
        return this;
    }

    public DeAuthorizeAccessKeysRequestBody withAccessKeyIds(Consumer<List<String>> accessKeyIdsSetter) {
        if (this.accessKeyIds == null) {
            this.accessKeyIds = new ArrayList<>();
        }
        accessKeyIdsSetter.accept(this.accessKeyIds);
        return this;
    }

    /**
     * 需要被解除授权的访问密钥的ID列表，若需要解除所有访问密钥的授权，则仅传入一个元素，且该元素值为“all”，如body为“{\"access_key_ids\": [\"all\"]}”
     * @return accessKeyIds
     */
    public List<String> getAccessKeyIds() {
        return accessKeyIds;
    }

    public void setAccessKeyIds(List<String> accessKeyIds) {
        this.accessKeyIds = accessKeyIds;
    }

    public DeAuthorizeAccessKeysRequestBody withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeAuthorizeAccessKeysRequestBody that = (DeAuthorizeAccessKeysRequestBody) obj;
        return Objects.equals(this.accessKeyIds, that.accessKeyIds) && Objects.equals(this.appId, that.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyIds, appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeAuthorizeAccessKeysRequestBody {\n");
        sb.append("    accessKeyIds: ").append(toIndentedString(accessKeyIds)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
