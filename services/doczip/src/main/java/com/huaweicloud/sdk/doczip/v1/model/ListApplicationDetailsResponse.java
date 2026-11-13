package com.huaweicloud.sdk.doczip.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListApplicationDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private ApplicationBasicInfoRsp basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_config")

    private SysconfigInfo systemConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocks_info")

    private Object blocksInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_info")

    private List<ReleaseAppInfo> releaseInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_info")

    private IDPDetailInfo idpInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")

    private String xTraceId;

    public ListApplicationDetailsResponse withBasicInfo(ApplicationBasicInfoRsp basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ListApplicationDetailsResponse withBasicInfo(Consumer<ApplicationBasicInfoRsp> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new ApplicationBasicInfoRsp();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public ApplicationBasicInfoRsp getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(ApplicationBasicInfoRsp basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ListApplicationDetailsResponse withSystemConfig(SysconfigInfo systemConfig) {
        this.systemConfig = systemConfig;
        return this;
    }

    public ListApplicationDetailsResponse withSystemConfig(Consumer<SysconfigInfo> systemConfigSetter) {
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

    public ListApplicationDetailsResponse withBlocksInfo(Object blocksInfo) {
        this.blocksInfo = blocksInfo;
        return this;
    }

    /**
     * **参数解释**： 文档块信息，仅当query_type为2或者4时返回。 支持more和basic两个列表，分别标识基础文档块和扩展文档块。 - basic：基础文档块列表，元素为文档块对象。 - more：扩展文档块列表，元素为文档块对象或分组标题对象。 - release_state：发布状态，true为已发布，false为未发布。 文档块对象支持字段如下： - code：文档块编码。 - pinyin：文档块简称。 - quanpin：文档块全程。 - name：文档块名称。 - icon：文档块图标。 - show：是否展示： true为展示，false为不展示。 - source：文档块来源，0标识系统文档块，分组标题对象中1标识自定义分组。 - darkIcon：暗黑模式文档块图标。 - key：文档块key值。 - data：文档块附加数据，可为字符串或对象（可选）。 分组标题对象字段如下： - source：分组来源。 - title：分组标题。 **取值范围**： 不涉及。
     * @return blocksInfo
     */
    public Object getBlocksInfo() {
        return blocksInfo;
    }

    public void setBlocksInfo(Object blocksInfo) {
        this.blocksInfo = blocksInfo;
    }

    public ListApplicationDetailsResponse withReleaseInfo(List<ReleaseAppInfo> releaseInfo) {
        this.releaseInfo = releaseInfo;
        return this;
    }

    public ListApplicationDetailsResponse addReleaseInfoItem(ReleaseAppInfo releaseInfoItem) {
        if (this.releaseInfo == null) {
            this.releaseInfo = new ArrayList<>();
        }
        this.releaseInfo.add(releaseInfoItem);
        return this;
    }

    public ListApplicationDetailsResponse withReleaseInfo(Consumer<List<ReleaseAppInfo>> releaseInfoSetter) {
        if (this.releaseInfo == null) {
            this.releaseInfo = new ArrayList<>();
        }
        releaseInfoSetter.accept(this.releaseInfo);
        return this;
    }

    /**
     * **参数解释**： 发布信息，仅当quey_type为3或者4时返回。 **取值范围**： 不涉及。
     * @return releaseInfo
     */
    public List<ReleaseAppInfo> getReleaseInfo() {
        return releaseInfo;
    }

    public void setReleaseInfo(List<ReleaseAppInfo> releaseInfo) {
        this.releaseInfo = releaseInfo;
    }

    public ListApplicationDetailsResponse withIdpInfo(IDPDetailInfo idpInfo) {
        this.idpInfo = idpInfo;
        return this;
    }

    public ListApplicationDetailsResponse withIdpInfo(Consumer<IDPDetailInfo> idpInfoSetter) {
        if (this.idpInfo == null) {
            this.idpInfo = new IDPDetailInfo();
            idpInfoSetter.accept(this.idpInfo);
        }

        return this;
    }

    /**
     * Get idpInfo
     * @return idpInfo
     */
    public IDPDetailInfo getIdpInfo() {
        return idpInfo;
    }

    public void setIdpInfo(IDPDetailInfo idpInfo) {
        this.idpInfo = idpInfo;
    }

    public ListApplicationDetailsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 发布信息的总数量，仅当查询包含发布信息时，该字段返回。 **取值范围**： 不涉及。
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListApplicationDetailsResponse withXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
        return this;
    }

    /**
     * Get xTraceId
     * @return xTraceId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")
    public String getXTraceId() {
        return xTraceId;
    }

    public void setXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApplicationDetailsResponse that = (ListApplicationDetailsResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.systemConfig, that.systemConfig)
            && Objects.equals(this.blocksInfo, that.blocksInfo) && Objects.equals(this.releaseInfo, that.releaseInfo)
            && Objects.equals(this.idpInfo, that.idpInfo) && Objects.equals(this.total, that.total)
            && Objects.equals(this.xTraceId, that.xTraceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, systemConfig, blocksInfo, releaseInfo, idpInfo, total, xTraceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationDetailsResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    systemConfig: ").append(toIndentedString(systemConfig)).append("\n");
        sb.append("    blocksInfo: ").append(toIndentedString(blocksInfo)).append("\n");
        sb.append("    releaseInfo: ").append(toIndentedString(releaseInfo)).append("\n");
        sb.append("    idpInfo: ").append(toIndentedString(idpInfo)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xTraceId: ").append(toIndentedString(xTraceId)).append("\n");
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
