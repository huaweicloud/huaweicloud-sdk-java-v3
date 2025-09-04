package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchResizeServersOption
 */
public class BatchResizeServersOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<ServerId> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_options")

    private CpuOptions cpuOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion")

    private Promotion promotion;

    public BatchResizeServersOption withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * flavor
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public BatchResizeServersOption withServers(List<ServerId> servers) {
        this.servers = servers;
        return this;
    }

    public BatchResizeServersOption addServersItem(ServerId serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public BatchResizeServersOption withServers(Consumer<List<ServerId>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * Get servers
     * @return servers
     */
    public List<ServerId> getServers() {
        return servers;
    }

    public void setServers(List<ServerId> servers) {
        this.servers = servers;
    }

    public BatchResizeServersOption withCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }

    public BatchResizeServersOption withCpuOptions(Consumer<CpuOptions> cpuOptionsSetter) {
        if (this.cpuOptions == null) {
            this.cpuOptions = new CpuOptions();
            cpuOptionsSetter.accept(this.cpuOptions);
        }

        return this;
    }

    /**
     * Get cpuOptions
     * @return cpuOptions
     */
    public CpuOptions getCpuOptions() {
        return cpuOptions;
    }

    public void setCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    public BatchResizeServersOption withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public BatchResizeServersOption withPromotion(Promotion promotion) {
        this.promotion = promotion;
        return this;
    }

    public BatchResizeServersOption withPromotion(Consumer<Promotion> promotionSetter) {
        if (this.promotion == null) {
            this.promotion = new Promotion();
            promotionSetter.accept(this.promotion);
        }

        return this;
    }

    /**
     * Get promotion
     * @return promotion
     */
    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchResizeServersOption that = (BatchResizeServersOption) obj;
        return Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.servers, that.servers)
            && Objects.equals(this.cpuOptions, that.cpuOptions) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.promotion, that.promotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, servers, cpuOptions, mode, promotion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchResizeServersOption {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    cpuOptions: ").append(toIndentedString(cpuOptions)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
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
