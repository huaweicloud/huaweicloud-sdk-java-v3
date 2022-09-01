package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Container network parameters.
 */
public class ContainerNetwork {

    /**
     * 容器网络类型（只可选择其一）  - overlay_l2：通过OVS（OpenVSwitch）为容器构建的overlay_l2网络。  - vpc-router：使用ipvlan和自定义VPC路由为容器构建的Underlay的l2网络。  [- eni：云原生网络2.0，深度整合VPC原生ENI弹性网卡能力，采用VPC网段分配容器地址，支持ELB直通容器，享有高性能，创建CCE Turbo集群时指定。](tag:hws,dt)
     */
    public static final class ModeEnum {

        /**
         * Enum OVERLAY_L2 for value: "overlay_l2"
         */
        public static final ModeEnum OVERLAY_L2 = new ModeEnum("overlay_l2");

        /**
         * Enum VPC_ROUTER for value: "vpc-router"
         */
        public static final ModeEnum VPC_ROUTER = new ModeEnum("vpc-router");

        /**
         * Enum ENI for value: "eni"
         */
        public static final ModeEnum ENI = new ModeEnum("eni");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("overlay_l2", OVERLAY_L2);
            map.put("vpc-router", VPC_ROUTER);
            map.put("eni", ENI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ModeEnum(value);
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    @JacksonXmlProperty(localName = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    @JacksonXmlProperty(localName = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidrs")

    @JacksonXmlProperty(localName = "cidrs")

    private List<ContainerCIDR> cidrs = null;

    public ContainerNetwork withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 容器网络类型（只可选择其一）  - overlay_l2：通过OVS（OpenVSwitch）为容器构建的overlay_l2网络。  - vpc-router：使用ipvlan和自定义VPC路由为容器构建的Underlay的l2网络。  [- eni：云原生网络2.0，深度整合VPC原生ENI弹性网卡能力，采用VPC网段分配容器地址，支持ELB直通容器，享有高性能，创建CCE Turbo集群时指定。](tag:hws,dt)
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public ContainerNetwork withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 容器网络网段，建议使用网段10.0.0.0/12~19，172.16.0.0/16~19，192.168.0.0/16~19，如存在网段冲突，将会报错。   此参数在集群创建后不可更改，请谨慎选择。（已废弃，如填写cidrs将忽略该cidr）
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public ContainerNetwork withCidrs(List<ContainerCIDR> cidrs) {
        this.cidrs = cidrs;
        return this;
    }

    public ContainerNetwork addCidrsItem(ContainerCIDR cidrsItem) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        this.cidrs.add(cidrsItem);
        return this;
    }

    public ContainerNetwork withCidrs(Consumer<List<ContainerCIDR>> cidrsSetter) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        cidrsSetter.accept(this.cidrs);
        return this;
    }

    /**
     * 容器网络网段列表。1.21及新版本集群使用cidrs字段，当集群网络类型为vpc-router类型时，支持多个容器网段；1.21之前版本若使用cidrs字段，则取值cidrs数组中的第一个cidr元素作为容器网络网段地址。  此参数在集群创建后不可更改，请谨慎选择。
     * @return cidrs
     */
    public List<ContainerCIDR> getCidrs() {
        return cidrs;
    }

    public void setCidrs(List<ContainerCIDR> cidrs) {
        this.cidrs = cidrs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerNetwork containerNetwork = (ContainerNetwork) o;
        return Objects.equals(this.mode, containerNetwork.mode) && Objects.equals(this.cidr, containerNetwork.cidr)
            && Objects.equals(this.cidrs, containerNetwork.cidrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, cidr, cidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerNetwork {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
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
