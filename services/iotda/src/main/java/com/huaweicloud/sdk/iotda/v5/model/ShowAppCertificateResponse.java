package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAppCertificateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cert_id")
    
    private String certId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_name")
    
    private String fileName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private String state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private String owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issuer")
    
    private String issuer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_date")
    
    private String effectiveDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expiry_date")
    
    private String expiryDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cn_name")
    
    private String cnName = "*";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="format")
    
    private String format;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private String updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private String content;

    public ShowAppCertificateResponse withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    


    /**
     * 证书ID，用于唯一标识一个证书，在物联网平台上传证书后由平台分配获得
     * @return certId
     */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public ShowAppCertificateResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 证书名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAppCertificateResponse withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    


    /**
     * 证书文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ShowAppCertificateResponse withState(String state) {
        this.state = state;
        return this;
    }

    


    /**
     * 证书状态,NORMAL代表证书正常,TOEXPIRE代表即将过期,EXPIRED代表证书已过期
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowAppCertificateResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    


    /**
     * 证书所有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ShowAppCertificateResponse withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    


    /**
     * 证书颁发者信息
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public ShowAppCertificateResponse withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    


    /**
     * 证书生效日期
     * @return effectiveDate
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public ShowAppCertificateResponse withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    


    /**
     * 证书失效日期
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public ShowAppCertificateResponse withCnName(String cnName) {
        this.cnName = cnName;
        return this;
    }

    


    /**
     * 证书CN名称
     * @return cnName
     */
    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public ShowAppCertificateResponse withFormat(String format) {
        this.format = format;
        return this;
    }

    


    /**
     * CA证书格式
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ShowAppCertificateResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 证书修改日期
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowAppCertificateResponse withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 证书内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAppCertificateResponse showAppCertificateResponse = (ShowAppCertificateResponse) o;
        return Objects.equals(this.certId, showAppCertificateResponse.certId) &&
            Objects.equals(this.name, showAppCertificateResponse.name) &&
            Objects.equals(this.fileName, showAppCertificateResponse.fileName) &&
            Objects.equals(this.state, showAppCertificateResponse.state) &&
            Objects.equals(this.owner, showAppCertificateResponse.owner) &&
            Objects.equals(this.issuer, showAppCertificateResponse.issuer) &&
            Objects.equals(this.effectiveDate, showAppCertificateResponse.effectiveDate) &&
            Objects.equals(this.expiryDate, showAppCertificateResponse.expiryDate) &&
            Objects.equals(this.cnName, showAppCertificateResponse.cnName) &&
            Objects.equals(this.format, showAppCertificateResponse.format) &&
            Objects.equals(this.updateTime, showAppCertificateResponse.updateTime) &&
            Objects.equals(this.content, showAppCertificateResponse.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certId, name, fileName, state, owner, issuer, effectiveDate, expiryDate, cnName, format, updateTime, content);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppCertificateResponse {\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

