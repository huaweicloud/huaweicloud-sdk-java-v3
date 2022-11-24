package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 通道号登记请求体。
 */
public class RegisterPortRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_type")

    private Integer portType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign")

    private List<String> sign = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_check")

    private Integer signCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_files")

    private List<String> authorizationFiles = null;

    public RegisterPortRequestBody withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 通道号。 - port_type=5时 ，长度必须为5 - port_type=1或3，长度在21位内 
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public RegisterPortRequestBody withPortType(Integer portType) {
        this.portType = portType;
        return this;
    }

    /**
     * 通道号类型。 - 1：普通 - 3：前缀号段 - 5：后缀号段 
     * minimum: 1
     * maximum: 5
     * @return portType
     */
    public Integer getPortType() {
        return portType;
    }

    public void setPortType(Integer portType) {
        this.portType = portType;
    }

    public RegisterPortRequestBody withSign(List<String> sign) {
        this.sign = sign;
        return this;
    }

    public RegisterPortRequestBody addSignItem(String signItem) {
        if (this.sign == null) {
            this.sign = new ArrayList<>();
        }
        this.sign.add(signItem);
        return this;
    }

    public RegisterPortRequestBody withSign(Consumer<List<String>> signSetter) {
        if (this.sign == null) {
            this.sign = new ArrayList<>();
        }
        signSetter.accept(this.sign);
        return this;
    }

    /**
     * 签名列表，最大长度为5。单个签名长度为2-18。
     * @return sign
     */
    public List<String> getSign() {
        return sign;
    }

    public void setSign(List<String> sign) {
        this.sign = sign;
    }

    public RegisterPortRequestBody withSignCheck(Integer signCheck) {
        this.signCheck = signCheck;
        return this;
    }

    /**
     * 是否需要校验。  - 0：不校验  - 1：校验签名  > 当port_type为3或者5时，sign_check必须为1。 
     * minimum: 0
     * maximum: 1
     * @return signCheck
     */
    public Integer getSignCheck() {
        return signCheck;
    }

    public void setSignCheck(Integer signCheck) {
        this.signCheck = signCheck;
    }

    public RegisterPortRequestBody withAuthorizationFiles(List<String> authorizationFiles) {
        this.authorizationFiles = authorizationFiles;
        return this;
    }

    public RegisterPortRequestBody addAuthorizationFilesItem(String authorizationFilesItem) {
        if (this.authorizationFiles == null) {
            this.authorizationFiles = new ArrayList<>();
        }
        this.authorizationFiles.add(authorizationFilesItem);
        return this;
    }

    public RegisterPortRequestBody withAuthorizationFiles(Consumer<List<String>> authorizationFilesSetter) {
        if (this.authorizationFiles == null) {
            this.authorizationFiles = new ArrayList<>();
        }
        authorizationFilesSetter.accept(this.authorizationFiles);
        return this;
    }

    /**
     * 授权证明图片资源，最多支持5张。参数格式为：*资源ID:资源URL*，样例：3d214a61672846f88ad77597f935cccc:AimSauploadService/272957b708ac4891a6d5282ccd2175cccc.png。 > 资源ID与资源URL对应上传智能信息服务号图片资源API返回的resource_id和resource_url。
     * @return authorizationFiles
     */
    public List<String> getAuthorizationFiles() {
        return authorizationFiles;
    }

    public void setAuthorizationFiles(List<String> authorizationFiles) {
        this.authorizationFiles = authorizationFiles;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisterPortRequestBody registerPortRequestBody = (RegisterPortRequestBody) o;
        return Objects.equals(this.port, registerPortRequestBody.port)
            && Objects.equals(this.portType, registerPortRequestBody.portType)
            && Objects.equals(this.sign, registerPortRequestBody.sign)
            && Objects.equals(this.signCheck, registerPortRequestBody.signCheck)
            && Objects.equals(this.authorizationFiles, registerPortRequestBody.authorizationFiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, portType, sign, signCheck, authorizationFiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterPortRequestBody {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
        sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
        sb.append("    signCheck: ").append(toIndentedString(signCheck)).append("\n");
        sb.append("    authorizationFiles: ").append(toIndentedString(authorizationFiles)).append("\n");
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
