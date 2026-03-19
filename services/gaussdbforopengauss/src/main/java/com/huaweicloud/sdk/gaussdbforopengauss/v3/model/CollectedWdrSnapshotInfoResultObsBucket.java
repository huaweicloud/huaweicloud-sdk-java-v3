package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 存储WDR报告临时文件的OBS桶信息。
 */
public class CollectedWdrSnapshotInfoResultObsBucket {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    public CollectedWdrSnapshotInfoResultObsBucket withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： OBS桶名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CollectedWdrSnapshotInfoResultObsBucket withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： OBS桶类型。 **取值范围**： - common：公共桶。 - aps：智能运维专用桶。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CollectedWdrSnapshotInfoResultObsBucket withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**： OBS服务访问地址。 **取值范围**： 不涉及。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CollectedWdrSnapshotInfoResultObsBucket withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： OBS服务端口号。 **取值范围**： 不涉及。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public CollectedWdrSnapshotInfoResultObsBucket withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 最终租户ID。 **取值范围**： 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectedWdrSnapshotInfoResultObsBucket that = (CollectedWdrSnapshotInfoResultObsBucket) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.url, that.url) && Objects.equals(this.port, that.port)
            && Objects.equals(this.domainId, that.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, url, port, domainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectedWdrSnapshotInfoResultObsBucket {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
