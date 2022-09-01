package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowShardingBalancerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open")

    @JacksonXmlProperty(localName = "is_open")

    private Boolean isOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_window")

    @JacksonXmlProperty(localName = "active_window")

    private BalancerActiveWindow activeWindow;

    public ShowShardingBalancerResponse withIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    /**
     * 集群均衡是否打开。
     * @return isOpen
     */
    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public ShowShardingBalancerResponse withActiveWindow(BalancerActiveWindow activeWindow) {
        this.activeWindow = activeWindow;
        return this;
    }

    public ShowShardingBalancerResponse withActiveWindow(Consumer<BalancerActiveWindow> activeWindowSetter) {
        if (this.activeWindow == null) {
            this.activeWindow = new BalancerActiveWindow();
            activeWindowSetter.accept(this.activeWindow);
        }

        return this;
    }

    /**
     * Get activeWindow
     * @return activeWindow
     */
    public BalancerActiveWindow getActiveWindow() {
        return activeWindow;
    }

    public void setActiveWindow(BalancerActiveWindow activeWindow) {
        this.activeWindow = activeWindow;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowShardingBalancerResponse showShardingBalancerResponse = (ShowShardingBalancerResponse) o;
        return Objects.equals(this.isOpen, showShardingBalancerResponse.isOpen)
            && Objects.equals(this.activeWindow, showShardingBalancerResponse.activeWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOpen, activeWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShardingBalancerResponse {\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
        sb.append("    activeWindow: ").append(toIndentedString(activeWindow)).append("\n");
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
