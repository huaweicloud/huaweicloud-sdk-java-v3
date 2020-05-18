package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class PostPaidServerExtendParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chargingMode")
    
    private Integer chargingMode = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regionID")
    
    private String regionID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="support_auto_recovery")
    
    private Boolean supportAutoRecovery = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId = "0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marketType")
    
    private String marketType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spotPrice")
    
    private String spotPrice;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="diskPrior")
    
    private String diskPrior;

    public PostPaidServerExtendParam withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 计费模式：  - 0：按需计费。
     * minimum: 0
     * maximum: 0
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public PostPaidServerExtendParam withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    


    /**
     * 云服务器所在区域ID。  请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)获取。
     * @return regionID
     */
    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public PostPaidServerExtendParam withSupportAutoRecovery(Boolean supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
        return this;
    }

    


    /**
     * 是否配置弹性云服务器自动恢复的功能。  - “true”：配置该功能 - “false”：不配置该功能  > 说明： >  > 此参数为boolean类型，若传入非boolean类型字符，程序将按照【“false”：不配置该功能】方式处理。 >  > 当marketType为spot时，不支持该功能。
     * @return supportAutoRecovery
     */
    public Boolean getSupportAutoRecovery() {
        return supportAutoRecovery;
    }

    public void setSupportAutoRecovery(Boolean supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
    }

    public PostPaidServerExtendParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。  > 说明： >  > 关于企业项目ID的获取及企业项目特性的详细信息，请参见《[企业管理服务用户指南](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)》。 >  > 该字段不传（或传为字符串“0”），则将资源绑定给默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PostPaidServerExtendParam withMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }

    


    /**
     * 创建竞价实例时，需指定该参数的值为“spot”。  > 说明： >  > 当chargingMode=0时且marketType=spot时此参数生效。
     * @return marketType
     */
    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public PostPaidServerExtendParam withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    


    /**
     * 用户愿意为竞价实例每小时支付的最高价格。  > 说明： >  > 仅chargingMode=0且marketType=spot时，该参数设置后生效。 >  > 当chargingMode=0且marketType=spot时，如果不传递spotPrice，默认使用按需购买的价格作为竞价。
     * @return spotPrice
     */
    public String getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    public PostPaidServerExtendParam withDiskPrior(String diskPrior) {
        this.diskPrior = diskPrior;
        return this;
    }

    


    /**
     * 是否支持先创建卷，再创建虚拟机。  “true”：配置该功能 “false”：不配置该功能
     * @return diskPrior
     */
    public String getDiskPrior() {
        return diskPrior;
    }

    public void setDiskPrior(String diskPrior) {
        this.diskPrior = diskPrior;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerExtendParam postPaidServerExtendParam = (PostPaidServerExtendParam) o;
        return Objects.equals(this.chargingMode, postPaidServerExtendParam.chargingMode) &&
            Objects.equals(this.regionID, postPaidServerExtendParam.regionID) &&
            Objects.equals(this.supportAutoRecovery, postPaidServerExtendParam.supportAutoRecovery) &&
            Objects.equals(this.enterpriseProjectId, postPaidServerExtendParam.enterpriseProjectId) &&
            Objects.equals(this.marketType, postPaidServerExtendParam.marketType) &&
            Objects.equals(this.spotPrice, postPaidServerExtendParam.spotPrice) &&
            Objects.equals(this.diskPrior, postPaidServerExtendParam.diskPrior);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargingMode, regionID, supportAutoRecovery, enterpriseProjectId, marketType, spotPrice, diskPrior);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerExtendParam {\n");
            sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
            sb.append("    regionID: ").append(toIndentedString(regionID)).append("\n");
            sb.append("    supportAutoRecovery: ").append(toIndentedString(supportAutoRecovery)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    marketType: ").append(toIndentedString(marketType)).append("\n");
            sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
            sb.append("    diskPrior: ").append(toIndentedString(diskPrior)).append("\n");
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

