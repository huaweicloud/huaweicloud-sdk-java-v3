package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ak/sk数据模型。
 */
public class AccessAkskVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_create")

    private String gmtCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_modify")

    private String gmtModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_domain_id")

    private Integer innerDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descp")

    private String descp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_create_timestamp")

    private Long gmtCreateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_modify_timestamp")

    private Long gmtModifyTimestamp;

    public AccessAkskVO withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * ak/sk的id。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AccessAkskVO withGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    /**
     * ak/sk的生成时间。
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public AccessAkskVO withGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }

    /**
     * ak/sk的修改时间。
     * @return gmtModify
     */
    public String getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
    }

    public AccessAkskVO withInnerDomainId(Integer innerDomainId) {
        this.innerDomainId = innerDomainId;
        return this;
    }

    /**
     * 内部租户id。
     * @return innerDomainId
     */
    public Integer getInnerDomainId() {
        return innerDomainId;
    }

    public void setInnerDomainId(Integer innerDomainId) {
        this.innerDomainId = innerDomainId;
    }

    public AccessAkskVO withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /**
     * 生成的ak。
     * @return ak
     */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public AccessAkskVO withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /**
     * 生成的sk。
     * @return sk
     */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public AccessAkskVO withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * ak/sk的状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AccessAkskVO withDescp(String descp) {
        this.descp = descp;
        return this;
    }

    /**
     * ak/sk的描述信息。
     * @return descp
     */
    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public AccessAkskVO withGmtCreateTimestamp(Long gmtCreateTimestamp) {
        this.gmtCreateTimestamp = gmtCreateTimestamp;
        return this;
    }

    /**
     * ak/sk的生成时间戳。
     * @return gmtCreateTimestamp
     */
    public Long getGmtCreateTimestamp() {
        return gmtCreateTimestamp;
    }

    public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
        this.gmtCreateTimestamp = gmtCreateTimestamp;
    }

    public AccessAkskVO withGmtModifyTimestamp(Long gmtModifyTimestamp) {
        this.gmtModifyTimestamp = gmtModifyTimestamp;
        return this;
    }

    /**
     * ak/sk的修改时间戳。
     * @return gmtModifyTimestamp
     */
    public Long getGmtModifyTimestamp() {
        return gmtModifyTimestamp;
    }

    public void setGmtModifyTimestamp(Long gmtModifyTimestamp) {
        this.gmtModifyTimestamp = gmtModifyTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessAkskVO that = (AccessAkskVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.gmtCreate, that.gmtCreate)
            && Objects.equals(this.gmtModify, that.gmtModify) && Objects.equals(this.innerDomainId, that.innerDomainId)
            && Objects.equals(this.ak, that.ak) && Objects.equals(this.sk, that.sk)
            && Objects.equals(this.status, that.status) && Objects.equals(this.descp, that.descp)
            && Objects.equals(this.gmtCreateTimestamp, that.gmtCreateTimestamp)
            && Objects.equals(this.gmtModifyTimestamp, that.gmtModifyTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            gmtCreate,
            gmtModify,
            innerDomainId,
            ak,
            sk,
            status,
            descp,
            gmtCreateTimestamp,
            gmtModifyTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessAkskVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
        sb.append("    gmtModify: ").append(toIndentedString(gmtModify)).append("\n");
        sb.append("    innerDomainId: ").append(toIndentedString(innerDomainId)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    descp: ").append(toIndentedString(descp)).append("\n");
        sb.append("    gmtCreateTimestamp: ").append(toIndentedString(gmtCreateTimestamp)).append("\n");
        sb.append("    gmtModifyTimestamp: ").append(toIndentedString(gmtModifyTimestamp)).append("\n");
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
