package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Links
 */
public class Links {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link-config-values")

    @JacksonXmlProperty(localName = "link-config-values")

    private LinksLinkconfigvalues linkConfigValues;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation-user")

    @JacksonXmlProperty(localName = "creation-user")

    private String creationUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation-date")

    @JacksonXmlProperty(localName = "creation-date")

    private Long creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector-name")

    @JacksonXmlProperty(localName = "connector-name")

    private String connectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update-date")

    @JacksonXmlProperty(localName = "update-date")

    private Long updateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    @JacksonXmlProperty(localName = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update-user")

    @JacksonXmlProperty(localName = "update-user")

    private String updateUser;

    public Links withLinkConfigValues(LinksLinkconfigvalues linkConfigValues) {
        this.linkConfigValues = linkConfigValues;
        return this;
    }

    public Links withLinkConfigValues(Consumer<LinksLinkconfigvalues> linkConfigValuesSetter) {
        if (this.linkConfigValues == null) {
            this.linkConfigValues = new LinksLinkconfigvalues();
            linkConfigValuesSetter.accept(this.linkConfigValues);
        }

        return this;
    }

    /**
     * Get linkConfigValues
     * @return linkConfigValues
     */
    public LinksLinkconfigvalues getLinkConfigValues() {
        return linkConfigValues;
    }

    public void setLinkConfigValues(LinksLinkconfigvalues linkConfigValues) {
        this.linkConfigValues = linkConfigValues;
    }

    public Links withCreationUser(String creationUser) {
        this.creationUser = creationUser;
        return this;
    }

    /**
     * 创建连接的用户
     * @return creationUser
     */
    public String getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser;
    }

    public Links withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 连接名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Links withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 连接ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Links withCreationDate(Long creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 创建连接的时间
     * @return creationDate
     */
    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public Links withConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }

    /**
     * 连接器名称，对应的连接参数如下：generic-jdbc-connector：关系数据库连接。obs-connector：OBS连接、阿里云OSS连接。hdfs-connector：HDFS连接。hbase-connector：HBase连接、CloudTable连接。hive-connector：Hive连接。ftp-connector/sftp-connector：FTP/SFTP连接。mongodb-connector：MongoDB连接。redis-connector：Redis/DCS连接。nas-connector：NAS/SFS连接。kafka-connector：Kafka连接。dis-connector：DIS连接。elasticsearch-connector：Elasticsearch/云搜索服务连接。dli-connector：DLI连接。opentsdb-connector：CloudTable OpenTSDB连接。http-connector：HTTP/HTTPS连接，该连接暂无连接参数。thirdparty-obs-connector：七牛云KODO/腾讯云COS连接、亚马逊对象存储连接。dms-kafka-connector：DMS Kafka连接
     * @return connectorName
     */
    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    public Links withUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * 更新连接的时间
     * @return updateDate
     */
    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    public Links withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否激活连接，默认为“true”
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Links withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新连接的用户
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Links links = (Links) o;
        return Objects.equals(this.linkConfigValues, links.linkConfigValues)
            && Objects.equals(this.creationUser, links.creationUser) && Objects.equals(this.name, links.name)
            && Objects.equals(this.id, links.id) && Objects.equals(this.creationDate, links.creationDate)
            && Objects.equals(this.connectorName, links.connectorName)
            && Objects.equals(this.updateDate, links.updateDate) && Objects.equals(this.enabled, links.enabled)
            && Objects.equals(this.updateUser, links.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkConfigValues,
            creationUser,
            name,
            id,
            creationDate,
            connectorName,
            updateDate,
            enabled,
            updateUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Links {\n");
        sb.append("    linkConfigValues: ").append(toIndentedString(linkConfigValues)).append("\n");
        sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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
