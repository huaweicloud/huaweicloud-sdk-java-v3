package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;

/**
 * 删除成功结果的Container。 
 */
@JacksonXmlRootElement(localName = "DeleteResultDeleted")
public class DeleteResultDeleted {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Key")

    @JacksonXmlProperty(localName = "Key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "VersionId")

    @JacksonXmlProperty(localName = "VersionId")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DeleteMarker")

    @JacksonXmlProperty(localName = "DeleteMarker")

    private Boolean deleteMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DeleteMarkerVersionId")

    @JacksonXmlProperty(localName = "DeleteMarkerVersionId")

    private Boolean deleteMarkerVersionId;

    public DeleteResultDeleted withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 每个删除结果的对象名。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DeleteResultDeleted withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 删除对象的版本号 
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public DeleteResultDeleted withDeleteMarker(Boolean deleteMarker) {
        this.deleteMarker = deleteMarker;
        return this;
    }

    /**
     * 当批量删除请求访问的桶是多版本桶时，如果创建或删除一个删除标记，返回消息中该元素的值为true。 
     * @return deleteMarker
     */
    public Boolean getDeleteMarker() {
        return deleteMarker;
    }

    public void setDeleteMarker(Boolean deleteMarker) {
        this.deleteMarker = deleteMarker;
    }

    public DeleteResultDeleted withDeleteMarkerVersionId(Boolean deleteMarkerVersionId) {
        this.deleteMarkerVersionId = deleteMarkerVersionId;
        return this;
    }

    /**
     * 请求创建或删除的删除标记版本号。  当批量删除请求访问的桶是多版本桶时，如果创建或删除一个删除标记，响应消息会返回该元素。该元素在以下两种情况中会出现：  用户发送不带版本删除请求，即请求只有对象名，无版本号。这种情况下，系统会创建一个删除标记，并在响应中返回该删除标记的版本号。 用户发送带版本删除请求，即请求同时包含对象名以及版本号，但是该版本号标识一个删除标记。这种情况下，系统会删除此删除标记，并在响应中返回该删除标记的版本号。 
     * @return deleteMarkerVersionId
     */
    public Boolean getDeleteMarkerVersionId() {
        return deleteMarkerVersionId;
    }

    public void setDeleteMarkerVersionId(Boolean deleteMarkerVersionId) {
        this.deleteMarkerVersionId = deleteMarkerVersionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteResultDeleted that = (DeleteResultDeleted) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.deleteMarker, that.deleteMarker)
            && Objects.equals(this.deleteMarkerVersionId, that.deleteMarkerVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, versionId, deleteMarker, deleteMarkerVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteResultDeleted {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    deleteMarker: ").append(toIndentedString(deleteMarker)).append("\n");
        sb.append("    deleteMarkerVersionId: ").append(toIndentedString(deleteMarkerVersionId)).append("\n");
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
