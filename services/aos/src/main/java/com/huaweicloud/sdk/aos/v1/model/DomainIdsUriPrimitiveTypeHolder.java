package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DomainIdsUriPrimitiveTypeHolder
 */
public class DomainIdsUriPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids_uri")

    private String domainIdsUri;

    public DomainIdsUriPrimitiveTypeHolder withDomainIdsUri(String domainIdsUri) {
        this.domainIdsUri = domainIdsUri;
        return this;
    }

    /**
     * 当资源栈集权限模型是SELF_MANAGED时，用户指定包含本次操作涉及到的租户ID内容文件的OBS地址。  内容格式要求每个租户ID以逗号（,）分割，支持换行。当前仅支持csv文件，且文件的编码格式须为UTF-8。文件内容大小不超过100KB。  上传的csv文件应尽量避免Excel操作，以防出现读取内容不一致的问题。推荐使用记事本打开确认内容是否符合预期。  *在DeployStackSet API中，如果指定该参数，根据用户输入的domain_ids_uri文件内容和regions列表，以笛卡尔积的形式选择资源栈集中存在的资源栈实例进行部署。如果内容包含了没有被资源栈集所管理的domain_id，则会报错。*  当资源栈集权限模型是SERVICE_MANAGED时，该参数需结合domain_id_filter_type使用。链接文件内容用于指定资源栈集操作涉及到的，从所提供的OU中指定或排除部署的租户ID信息，或除提供的OU外，还进行额外部署的租户ID信息。  domain_ids和domain_ids_uri有且仅有一个存在。
     * @return domainIdsUri
     */
    public String getDomainIdsUri() {
        return domainIdsUri;
    }

    public void setDomainIdsUri(String domainIdsUri) {
        this.domainIdsUri = domainIdsUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainIdsUriPrimitiveTypeHolder that = (DomainIdsUriPrimitiveTypeHolder) obj;
        return Objects.equals(this.domainIdsUri, that.domainIdsUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainIdsUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainIdsUriPrimitiveTypeHolder {\n");
        sb.append("    domainIdsUri: ").append(toIndentedString(domainIdsUri)).append("\n");
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
