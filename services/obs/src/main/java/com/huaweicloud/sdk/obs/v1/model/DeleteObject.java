package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;

/**
 * 待删除的对象。 
 */
@JacksonXmlRootElement(localName = "DeleteObject")
public class DeleteObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Key")

    @JacksonXmlProperty(localName = "Key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "VersionId")

    @JacksonXmlProperty(localName = "VersionId")

    private String versionId;

    public DeleteObject withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 待删除的对象Key。如果设置了EncodingType元素，对象Key需要按照对应的编码类型进行编码。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DeleteObject withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 待删除的对象版本号。 
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteObject that = (DeleteObject) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.versionId, that.versionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, versionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteObject {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
