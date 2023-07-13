package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点重装场景服务器配置
 */
public class ReinstallServerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userTags")

    private List<UserTag> userTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rootVolume")

    private ReinstallVolumeSpec rootVolume;

    public ReinstallServerConfig withUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
        return this;
    }

    public ReinstallServerConfig addUserTagsItem(UserTag userTagsItem) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        this.userTags.add(userTagsItem);
        return this;
    }

    public ReinstallServerConfig withUserTags(Consumer<List<UserTag>> userTagsSetter) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        userTagsSetter.accept(this.userTags);
        return this;
    }

    /**
     * 云服务器标签，键必须唯一，CCE支持的最大用户自定义标签数量依region而定，自定义标签数上限为5个。
     * @return userTags
     */
    public List<UserTag> getUserTags() {
        return userTags;
    }

    public void setUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
    }

    public ReinstallServerConfig withRootVolume(ReinstallVolumeSpec rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public ReinstallServerConfig withRootVolume(Consumer<ReinstallVolumeSpec> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new ReinstallVolumeSpec();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public ReinstallVolumeSpec getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(ReinstallVolumeSpec rootVolume) {
        this.rootVolume = rootVolume;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReinstallServerConfig that = (ReinstallServerConfig) obj;
        return Objects.equals(this.userTags, that.userTags) && Objects.equals(this.rootVolume, that.rootVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userTags, rootVolume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallServerConfig {\n");
        sb.append("    userTags: ").append(toIndentedString(userTags)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
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
