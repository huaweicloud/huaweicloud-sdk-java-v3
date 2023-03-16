package com.huaweicloud.sdk.organizations.v1.model;

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
public class ListEntitiesForPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_entities")

    private List<EntityDto> attachedEntities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListEntitiesForPolicyResponse withAttachedEntities(List<EntityDto> attachedEntities) {
        this.attachedEntities = attachedEntities;
        return this;
    }

    public ListEntitiesForPolicyResponse addAttachedEntitiesItem(EntityDto attachedEntitiesItem) {
        if (this.attachedEntities == null) {
            this.attachedEntities = new ArrayList<>();
        }
        this.attachedEntities.add(attachedEntitiesItem);
        return this;
    }

    public ListEntitiesForPolicyResponse withAttachedEntities(Consumer<List<EntityDto>> attachedEntitiesSetter) {
        if (this.attachedEntities == null) {
            this.attachedEntities = new ArrayList<>();
        }
        attachedEntitiesSetter.accept(this.attachedEntities);
        return this;
    }

    /**
     * 结构列表，每个结构都包含有关指定策略附加到的实体的详细信息。
     * @return attachedEntities
     */
    public List<EntityDto> getAttachedEntities() {
        return attachedEntities;
    }

    public void setAttachedEntities(List<EntityDto> attachedEntities) {
        this.attachedEntities = attachedEntities;
    }

    public ListEntitiesForPolicyResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListEntitiesForPolicyResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEntitiesForPolicyResponse listEntitiesForPolicyResponse = (ListEntitiesForPolicyResponse) o;
        return Objects.equals(this.attachedEntities, listEntitiesForPolicyResponse.attachedEntities)
            && Objects.equals(this.pageInfo, listEntitiesForPolicyResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedEntities, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEntitiesForPolicyResponse {\n");
        sb.append("    attachedEntities: ").append(toIndentedString(attachedEntities)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
