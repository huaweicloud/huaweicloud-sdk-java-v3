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
public class ListCreateAccountStatusesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_account_statuses")

    private List<CreateAccountStatusDto> createAccountStatuses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListCreateAccountStatusesResponse withCreateAccountStatuses(
        List<CreateAccountStatusDto> createAccountStatuses) {
        this.createAccountStatuses = createAccountStatuses;
        return this;
    }

    public ListCreateAccountStatusesResponse addCreateAccountStatusesItem(
        CreateAccountStatusDto createAccountStatusesItem) {
        if (this.createAccountStatuses == null) {
            this.createAccountStatuses = new ArrayList<>();
        }
        this.createAccountStatuses.add(createAccountStatusesItem);
        return this;
    }

    public ListCreateAccountStatusesResponse withCreateAccountStatuses(
        Consumer<List<CreateAccountStatusDto>> createAccountStatusesSetter) {
        if (this.createAccountStatuses == null) {
            this.createAccountStatuses = new ArrayList<>();
        }
        createAccountStatusesSetter.accept(this.createAccountStatuses);
        return this;
    }

    /**
     * 包含有关请求的详细信息的对象列表。
     * @return createAccountStatuses
     */
    public List<CreateAccountStatusDto> getCreateAccountStatuses() {
        return createAccountStatuses;
    }

    public void setCreateAccountStatuses(List<CreateAccountStatusDto> createAccountStatuses) {
        this.createAccountStatuses = createAccountStatuses;
    }

    public ListCreateAccountStatusesResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCreateAccountStatusesResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListCreateAccountStatusesResponse listCreateAccountStatusesResponse = (ListCreateAccountStatusesResponse) o;
        return Objects.equals(this.createAccountStatuses, listCreateAccountStatusesResponse.createAccountStatuses)
            && Objects.equals(this.pageInfo, listCreateAccountStatusesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createAccountStatuses, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCreateAccountStatusesResponse {\n");
        sb.append("    createAccountStatuses: ").append(toIndentedString(createAccountStatuses)).append("\n");
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
