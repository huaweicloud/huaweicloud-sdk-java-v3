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
public class UpdateAppCertificateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cert_id")
    
    private String certId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private String host;


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

    public UpdateAppCertificateResponse withCertId(String certId) {
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

    public UpdateAppCertificateResponse withName(String name) {
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

    public UpdateAppCertificateResponse withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * CA证书所对应的应用服务器，例：www.example.com:8443 或 100.6.8.9:8443
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public UpdateAppCertificateResponse withFileName(String fileName) {
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

    public UpdateAppCertificateResponse withState(String state) {
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

    public UpdateAppCertificateResponse withOwner(String owner) {
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

    public UpdateAppCertificateResponse withIssuer(String issuer) {
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

    public UpdateAppCertificateResponse withEffectiveDate(String effectiveDate) {
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

    public UpdateAppCertificateResponse withExpiryDate(String expiryDate) {
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

    public UpdateAppCertificateResponse withCnName(String cnName) {
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

    public UpdateAppCertificateResponse withFormat(String format) {
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

    public UpdateAppCertificateResponse withUpdateTime(String updateTime) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAppCertificateResponse updateAppCertificateResponse = (UpdateAppCertificateResponse) o;
        return Objects.equals(this.certId, updateAppCertificateResponse.certId) &&
            Objects.equals(this.name, updateAppCertificateResponse.name) &&
            Objects.equals(this.host, updateAppCertificateResponse.host) &&
            Objects.equals(this.fileName, updateAppCertificateResponse.fileName) &&
            Objects.equals(this.state, updateAppCertificateResponse.state) &&
            Objects.equals(this.owner, updateAppCertificateResponse.owner) &&
            Objects.equals(this.issuer, updateAppCertificateResponse.issuer) &&
            Objects.equals(this.effectiveDate, updateAppCertificateResponse.effectiveDate) &&
            Objects.equals(this.expiryDate, updateAppCertificateResponse.expiryDate) &&
            Objects.equals(this.cnName, updateAppCertificateResponse.cnName) &&
            Objects.equals(this.format, updateAppCertificateResponse.format) &&
            Objects.equals(this.updateTime, updateAppCertificateResponse.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certId, name, host, fileName, state, owner, issuer, effectiveDate, expiryDate, cnName, format, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppCertificateResponse {\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

