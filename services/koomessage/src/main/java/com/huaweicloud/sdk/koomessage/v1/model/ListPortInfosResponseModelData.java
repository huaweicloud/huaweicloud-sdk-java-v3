package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListPortInfosResponseModelData
 */
public class ListPortInfosResponseModelData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_id")

    private String pubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign")

    private List<String> sign = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_files")

    private Map<String, String> authorizationFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_name")

    private String pubName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_type")

    private Integer portType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_check")

    private Integer signCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_bind")

    private Integer isBind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_list")

    private List<PortSearchPubDetail> pubList = null;

    public ListPortInfosResponseModelData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListPortInfosResponseModelData withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式：yyyy-MM-ddTHH:mm:ssZ。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ListPortInfosResponseModelData withPubId(String pubId) {
        this.pubId = pubId;
        return this;
    }

    /**
     * 服务号ID，在通道号列表显示为null。
     * @return pubId
     */
    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public ListPortInfosResponseModelData withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 通道号。 
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public ListPortInfosResponseModelData withSign(List<String> sign) {
        this.sign = sign;
        return this;
    }

    public ListPortInfosResponseModelData addSignItem(String signItem) {
        if (this.sign == null) {
            this.sign = new ArrayList<>();
        }
        this.sign.add(signItem);
        return this;
    }

    public ListPortInfosResponseModelData withSign(Consumer<List<String>> signSetter) {
        if (this.sign == null) {
            this.sign = new ArrayList<>();
        }
        signSetter.accept(this.sign);
        return this;
    }

    /**
     * 签名数组。  - 查询通道号列表时，该项为通道号签名列表  - 查询绑定关系时，该项为通道号绑定签名列表 
     * @return sign
     */
    public List<String> getSign() {
        return sign;
    }

    public void setSign(List<String> sign) {
        this.sign = sign;
    }

    public ListPortInfosResponseModelData withAuthorizationFiles(Map<String, String> authorizationFiles) {
        this.authorizationFiles = authorizationFiles;
        return this;
    }

    public ListPortInfosResponseModelData putAuthorizationFilesItem(String key, String authorizationFilesItem) {
        if (this.authorizationFiles == null) {
            this.authorizationFiles = new HashMap<>();
        }
        this.authorizationFiles.put(key, authorizationFilesItem);
        return this;
    }

    public ListPortInfosResponseModelData withAuthorizationFiles(
        Consumer<Map<String, String>> authorizationFilesSetter) {
        if (this.authorizationFiles == null) {
            this.authorizationFiles = new HashMap<>();
        }
        authorizationFilesSetter.accept(this.authorizationFiles);
        return this;
    }

    /**
     * 授权证明图片，key是上传的图片ID，value是图片对应的URL。
     * @return authorizationFiles
     */
    public Map<String, String> getAuthorizationFiles() {
        return authorizationFiles;
    }

    public void setAuthorizationFiles(Map<String, String> authorizationFiles) {
        this.authorizationFiles = authorizationFiles;
    }

    public ListPortInfosResponseModelData withPubName(String pubName) {
        this.pubName = pubName;
        return this;
    }

    /**
     * 服务号名称，查询通道号列表时该项为null。
     * @return pubName
     */
    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public ListPortInfosResponseModelData withPortType(Integer portType) {
        this.portType = portType;
        return this;
    }

    /**
     * 通道号类型。 - 1：普通 - 3：前缀号段 - 5：后缀号段  
     * @return portType
     */
    public Integer getPortType() {
        return portType;
    }

    public void setPortType(Integer portType) {
        this.portType = portType;
    }

    public ListPortInfosResponseModelData withSignCheck(Integer signCheck) {
        this.signCheck = signCheck;
        return this;
    }

    /**
     * 是否需要校验。  - 0：不校验 - 1：校验签名 
     * @return signCheck
     */
    public Integer getSignCheck() {
        return signCheck;
    }

    public void setSignCheck(Integer signCheck) {
        this.signCheck = signCheck;
    }

    public ListPortInfosResponseModelData withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 未绑定服务号时该项为null。
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public ListPortInfosResponseModelData withIsBind(Integer isBind) {
        this.isBind = isBind;
        return this;
    }

    /**
     * 是否绑定。  - 0: 未绑定 - 1: 绑定 
     * @return isBind
     */
    public Integer getIsBind() {
        return isBind;
    }

    public void setIsBind(Integer isBind) {
        this.isBind = isBind;
    }

    public ListPortInfosResponseModelData withPubList(List<PortSearchPubDetail> pubList) {
        this.pubList = pubList;
        return this;
    }

    public ListPortInfosResponseModelData addPubListItem(PortSearchPubDetail pubListItem) {
        if (this.pubList == null) {
            this.pubList = new ArrayList<>();
        }
        this.pubList.add(pubListItem);
        return this;
    }

    public ListPortInfosResponseModelData withPubList(Consumer<List<PortSearchPubDetail>> pubListSetter) {
        if (this.pubList == null) {
            this.pubList = new ArrayList<>();
        }
        pubListSetter.accept(this.pubList);
        return this;
    }

    /**
     * 绑定的服务号列表。  > 以JSON列表返回，格式： > [{\"pub_name\":\"服务号名称\",\"pub_reference\":\"服务号备注\"}]。 
     * @return pubList
     */
    public List<PortSearchPubDetail> getPubList() {
        return pubList;
    }

    public void setPubList(List<PortSearchPubDetail> pubList) {
        this.pubList = pubList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPortInfosResponseModelData listPortInfosResponseModelData = (ListPortInfosResponseModelData) o;
        return Objects.equals(this.id, listPortInfosResponseModelData.id)
            && Objects.equals(this.createTime, listPortInfosResponseModelData.createTime)
            && Objects.equals(this.pubId, listPortInfosResponseModelData.pubId)
            && Objects.equals(this.port, listPortInfosResponseModelData.port)
            && Objects.equals(this.sign, listPortInfosResponseModelData.sign)
            && Objects.equals(this.authorizationFiles, listPortInfosResponseModelData.authorizationFiles)
            && Objects.equals(this.pubName, listPortInfosResponseModelData.pubName)
            && Objects.equals(this.portType, listPortInfosResponseModelData.portType)
            && Objects.equals(this.signCheck, listPortInfosResponseModelData.signCheck)
            && Objects.equals(this.province, listPortInfosResponseModelData.province)
            && Objects.equals(this.isBind, listPortInfosResponseModelData.isBind)
            && Objects.equals(this.pubList, listPortInfosResponseModelData.pubList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createTime,
            pubId,
            port,
            sign,
            authorizationFiles,
            pubName,
            portType,
            signCheck,
            province,
            isBind,
            pubList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPortInfosResponseModelData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    pubId: ").append(toIndentedString(pubId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
        sb.append("    authorizationFiles: ").append(toIndentedString(authorizationFiles)).append("\n");
        sb.append("    pubName: ").append(toIndentedString(pubName)).append("\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
        sb.append("    signCheck: ").append(toIndentedString(signCheck)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    isBind: ").append(toIndentedString(isBind)).append("\n");
        sb.append("    pubList: ").append(toIndentedString(pubList)).append("\n");
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
