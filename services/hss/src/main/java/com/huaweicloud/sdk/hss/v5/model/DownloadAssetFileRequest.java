package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DownloadAssetFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DownloadAssetFileRequestBody body;

    public DownloadAssetFileRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public DownloadAssetFileRequest withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * **参数解释**: 资产指纹类型 **约束限制**: 不涉及 **取值范围**: - users         ：账号 - auto_launch   ：自启动项 - database      ：数据库 - jar_package   ：中间件 - port          ：开放端口 - process       ：进程 - web_cms       ：web应用 - web_framework ：web框架 - web_service   ：web服务 - web_site      ：web站点 - app           ：软件 - kernel_module ：内核模块  **默认取值**: 不涉及 
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public DownloadAssetFileRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: 类别 **约束限制**: 不涉及 **取值范围**: - host     ：主机 - container：容器  **默认取值**: host 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public DownloadAssetFileRequest withBody(DownloadAssetFileRequestBody body) {
        this.body = body;
        return this;
    }

    public DownloadAssetFileRequest withBody(Consumer<DownloadAssetFileRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DownloadAssetFileRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DownloadAssetFileRequestBody getBody() {
        return body;
    }

    public void setBody(DownloadAssetFileRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAssetFileRequest that = (DownloadAssetFileRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.category, that.category)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, assetType, category, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadAssetFileRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
