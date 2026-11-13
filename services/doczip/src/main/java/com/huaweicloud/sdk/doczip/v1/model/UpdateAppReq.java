package com.huaweicloud.sdk.doczip.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新应用消息
 */
public class UpdateAppReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private ApplicationBasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_config")

    private SysconfigInfo systemConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocks_config")

    private Object blocksConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_detail")

    private IDPDetailVo idpDetail;

    public UpdateAppReq withBasicInfo(ApplicationBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public UpdateAppReq withBasicInfo(Consumer<ApplicationBasicInfo> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new ApplicationBasicInfo();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public ApplicationBasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(ApplicationBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public UpdateAppReq withSystemConfig(SysconfigInfo systemConfig) {
        this.systemConfig = systemConfig;
        return this;
    }

    public UpdateAppReq withSystemConfig(Consumer<SysconfigInfo> systemConfigSetter) {
        if (this.systemConfig == null) {
            this.systemConfig = new SysconfigInfo();
            systemConfigSetter.accept(this.systemConfig);
        }

        return this;
    }

    /**
     * Get systemConfig
     * @return systemConfig
     */
    public SysconfigInfo getSystemConfig() {
        return systemConfig;
    }

    public void setSystemConfig(SysconfigInfo systemConfig) {
        this.systemConfig = systemConfig;
    }

    public UpdateAppReq withBlocksConfig(Object blocksConfig) {
        this.blocksConfig = blocksConfig;
        return this;
    }

    /**
     * **参数解释**： 文档块配置。 支持more和basic两个列表，分别标识基础文档块和扩展文档块。 - basic：基础文档块列表，元素为文档块对象。 - more：扩展文档块列表，元素为文档块对象或分组标题对象。 - release_state：发布状态，true为已发布，false为未发布。 文档块对象支持字段如下： - code：文档块编码。 - pinyin：文档块简称。 - quanpin：文档块全程。 - name：文档块名称。 - icon：文档块图标。 - show：是否展示： true为展示，false为不展示。 - source：文档块来源，0标识系统文档块，分组标题对象中1标识自定义分组。 - darkIcon：暗黑模式文档块图标。 - key：文档块key值。 - data：文档块附加数据，可为字符串或对象（可选）。 分组标题对象字段如下： - source：分组来源。 - title：分组标题。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return blocksConfig
     */
    public Object getBlocksConfig() {
        return blocksConfig;
    }

    public void setBlocksConfig(Object blocksConfig) {
        this.blocksConfig = blocksConfig;
    }

    public UpdateAppReq withIdpDetail(IDPDetailVo idpDetail) {
        this.idpDetail = idpDetail;
        return this;
    }

    public UpdateAppReq withIdpDetail(Consumer<IDPDetailVo> idpDetailSetter) {
        if (this.idpDetail == null) {
            this.idpDetail = new IDPDetailVo();
            idpDetailSetter.accept(this.idpDetail);
        }

        return this;
    }

    /**
     * Get idpDetail
     * @return idpDetail
     */
    public IDPDetailVo getIdpDetail() {
        return idpDetail;
    }

    public void setIdpDetail(IDPDetailVo idpDetail) {
        this.idpDetail = idpDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAppReq that = (UpdateAppReq) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.systemConfig, that.systemConfig)
            && Objects.equals(this.blocksConfig, that.blocksConfig) && Objects.equals(this.idpDetail, that.idpDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, systemConfig, blocksConfig, idpDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppReq {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    systemConfig: ").append(toIndentedString(systemConfig)).append("\n");
        sb.append("    blocksConfig: ").append(toIndentedString(blocksConfig)).append("\n");
        sb.append("    idpDetail: ").append(toIndentedString(idpDetail)).append("\n");
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
