package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListServerCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_certificates")

    private List<ServerCertificateDTO> serverCertificates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListServerCertificateResponse withServerCertificates(List<ServerCertificateDTO> serverCertificates) {
        this.serverCertificates = serverCertificates;
        return this;
    }

    public ListServerCertificateResponse addServerCertificatesItem(ServerCertificateDTO serverCertificatesItem) {
        if (this.serverCertificates == null) {
            this.serverCertificates = new ArrayList<>();
        }
        this.serverCertificates.add(serverCertificatesItem);
        return this;
    }

    public ListServerCertificateResponse withServerCertificates(
        Consumer<List<ServerCertificateDTO>> serverCertificatesSetter) {
        if (this.serverCertificates == null) {
            this.serverCertificates = new ArrayList<>();
        }
        serverCertificatesSetter.accept(this.serverCertificates);
        return this;
    }

    /**
     * **参数说明**：服务端证书列表。
     * @return serverCertificates
     */
    public List<ServerCertificateDTO> getServerCertificates() {
        return serverCertificates;
    }

    public void setServerCertificates(List<ServerCertificateDTO> serverCertificates) {
        this.serverCertificates = serverCertificates;
    }

    public ListServerCertificateResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListServerCertificateResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServerCertificateResponse that = (ListServerCertificateResponse) obj;
        return Objects.equals(this.serverCertificates, that.serverCertificates) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverCertificates, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerCertificateResponse {\n");
        sb.append("    serverCertificates: ").append(toIndentedString(serverCertificates)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
