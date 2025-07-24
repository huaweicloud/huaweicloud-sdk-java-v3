package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重装OS请求参数，不会擦除数据盘
 */
public class ReinstallOSOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id_set")

    private List<String> instanceIdSet = null;

    public ReinstallOSOptions withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID，非必填，不传默认使用当前镜像ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ReinstallOSOptions withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 设置实例的管理员账户初始登录密码，其中，Linux管理员账户为root，Windows管理员账户为Administrator。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ReinstallOSOptions withInstanceIdSet(List<String> instanceIdSet) {
        this.instanceIdSet = instanceIdSet;
        return this;
    }

    public ReinstallOSOptions addInstanceIdSetItem(String instanceIdSetItem) {
        if (this.instanceIdSet == null) {
            this.instanceIdSet = new ArrayList<>();
        }
        this.instanceIdSet.add(instanceIdSetItem);
        return this;
    }

    public ReinstallOSOptions withInstanceIdSet(Consumer<List<String>> instanceIdSetSetter) {
        if (this.instanceIdSet == null) {
            this.instanceIdSet = new ArrayList<>();
        }
        instanceIdSetSetter.accept(this.instanceIdSet);
        return this;
    }

    /**
     * **参数解释**： 实例id 列表 **约束限制**： 实例id不超过10条 
     * @return instanceIdSet
     */
    public List<String> getInstanceIdSet() {
        return instanceIdSet;
    }

    public void setInstanceIdSet(List<String> instanceIdSet) {
        this.instanceIdSet = instanceIdSet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReinstallOSOptions that = (ReinstallOSOptions) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.password, that.password)
            && Objects.equals(this.instanceIdSet, that.instanceIdSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, password, instanceIdSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallOSOptions {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    instanceIdSet: ").append(toIndentedString(instanceIdSet)).append("\n");
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
