package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 访问配置，与access_protocol直接关联
 */
public class AccessConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private ValueInAttributes protocolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_name")

    private ValueInAttributes protocolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_id")

    private ValueInAttributes slaveId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private ValueInAttributes ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private ValueInAttributes port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_port")

    private ValueInAttributes serialPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baud_rate")

    private ValueInAttributes baudRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_bits")

    private ValueInAttributes dataBits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_bits")

    private ValueInAttributes stopBits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parity_bits")

    private ValueInAttributes parityBits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private ValueInAttributes url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sec_mode")

    private ValueInAttributes secMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sec_policy")

    private ValueInAttributes secPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private ValueInAttributes authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private ValueInAttributes username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private ValueInAttributes password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private ValueInAttributes privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private ValueInAttributes certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private ValueInAttributes timeout;

    public AccessConfig withProtocolType(ValueInAttributes protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    public AccessConfig withProtocolType(Consumer<ValueInAttributes> protocolTypeSetter) {
        if (this.protocolType == null) {
            this.protocolType = new ValueInAttributes();
            protocolTypeSetter.accept(this.protocolType);
        }

        return this;
    }

    /**
     * Get protocolType
     * @return protocolType
     */
    public ValueInAttributes getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(ValueInAttributes protocolType) {
        this.protocolType = protocolType;
    }

    public AccessConfig withProtocolName(ValueInAttributes protocolName) {
        this.protocolName = protocolName;
        return this;
    }

    public AccessConfig withProtocolName(Consumer<ValueInAttributes> protocolNameSetter) {
        if (this.protocolName == null) {
            this.protocolName = new ValueInAttributes();
            protocolNameSetter.accept(this.protocolName);
        }

        return this;
    }

    /**
     * Get protocolName
     * @return protocolName
     */
    public ValueInAttributes getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(ValueInAttributes protocolName) {
        this.protocolName = protocolName;
    }

    public AccessConfig withSlaveId(ValueInAttributes slaveId) {
        this.slaveId = slaveId;
        return this;
    }

    public AccessConfig withSlaveId(Consumer<ValueInAttributes> slaveIdSetter) {
        if (this.slaveId == null) {
            this.slaveId = new ValueInAttributes();
            slaveIdSetter.accept(this.slaveId);
        }

        return this;
    }

    /**
     * Get slaveId
     * @return slaveId
     */
    public ValueInAttributes getSlaveId() {
        return slaveId;
    }

    public void setSlaveId(ValueInAttributes slaveId) {
        this.slaveId = slaveId;
    }

    public AccessConfig withIp(ValueInAttributes ip) {
        this.ip = ip;
        return this;
    }

    public AccessConfig withIp(Consumer<ValueInAttributes> ipSetter) {
        if (this.ip == null) {
            this.ip = new ValueInAttributes();
            ipSetter.accept(this.ip);
        }

        return this;
    }

    /**
     * Get ip
     * @return ip
     */
    public ValueInAttributes getIp() {
        return ip;
    }

    public void setIp(ValueInAttributes ip) {
        this.ip = ip;
    }

    public AccessConfig withPort(ValueInAttributes port) {
        this.port = port;
        return this;
    }

    public AccessConfig withPort(Consumer<ValueInAttributes> portSetter) {
        if (this.port == null) {
            this.port = new ValueInAttributes();
            portSetter.accept(this.port);
        }

        return this;
    }

    /**
     * Get port
     * @return port
     */
    public ValueInAttributes getPort() {
        return port;
    }

    public void setPort(ValueInAttributes port) {
        this.port = port;
    }

    public AccessConfig withSerialPort(ValueInAttributes serialPort) {
        this.serialPort = serialPort;
        return this;
    }

    public AccessConfig withSerialPort(Consumer<ValueInAttributes> serialPortSetter) {
        if (this.serialPort == null) {
            this.serialPort = new ValueInAttributes();
            serialPortSetter.accept(this.serialPort);
        }

        return this;
    }

    /**
     * Get serialPort
     * @return serialPort
     */
    public ValueInAttributes getSerialPort() {
        return serialPort;
    }

    public void setSerialPort(ValueInAttributes serialPort) {
        this.serialPort = serialPort;
    }

    public AccessConfig withBaudRate(ValueInAttributes baudRate) {
        this.baudRate = baudRate;
        return this;
    }

    public AccessConfig withBaudRate(Consumer<ValueInAttributes> baudRateSetter) {
        if (this.baudRate == null) {
            this.baudRate = new ValueInAttributes();
            baudRateSetter.accept(this.baudRate);
        }

        return this;
    }

    /**
     * Get baudRate
     * @return baudRate
     */
    public ValueInAttributes getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(ValueInAttributes baudRate) {
        this.baudRate = baudRate;
    }

    public AccessConfig withDataBits(ValueInAttributes dataBits) {
        this.dataBits = dataBits;
        return this;
    }

    public AccessConfig withDataBits(Consumer<ValueInAttributes> dataBitsSetter) {
        if (this.dataBits == null) {
            this.dataBits = new ValueInAttributes();
            dataBitsSetter.accept(this.dataBits);
        }

        return this;
    }

    /**
     * Get dataBits
     * @return dataBits
     */
    public ValueInAttributes getDataBits() {
        return dataBits;
    }

    public void setDataBits(ValueInAttributes dataBits) {
        this.dataBits = dataBits;
    }

    public AccessConfig withStopBits(ValueInAttributes stopBits) {
        this.stopBits = stopBits;
        return this;
    }

    public AccessConfig withStopBits(Consumer<ValueInAttributes> stopBitsSetter) {
        if (this.stopBits == null) {
            this.stopBits = new ValueInAttributes();
            stopBitsSetter.accept(this.stopBits);
        }

        return this;
    }

    /**
     * Get stopBits
     * @return stopBits
     */
    public ValueInAttributes getStopBits() {
        return stopBits;
    }

    public void setStopBits(ValueInAttributes stopBits) {
        this.stopBits = stopBits;
    }

    public AccessConfig withParityBits(ValueInAttributes parityBits) {
        this.parityBits = parityBits;
        return this;
    }

    public AccessConfig withParityBits(Consumer<ValueInAttributes> parityBitsSetter) {
        if (this.parityBits == null) {
            this.parityBits = new ValueInAttributes();
            parityBitsSetter.accept(this.parityBits);
        }

        return this;
    }

    /**
     * Get parityBits
     * @return parityBits
     */
    public ValueInAttributes getParityBits() {
        return parityBits;
    }

    public void setParityBits(ValueInAttributes parityBits) {
        this.parityBits = parityBits;
    }

    public AccessConfig withUrl(ValueInAttributes url) {
        this.url = url;
        return this;
    }

    public AccessConfig withUrl(Consumer<ValueInAttributes> urlSetter) {
        if (this.url == null) {
            this.url = new ValueInAttributes();
            urlSetter.accept(this.url);
        }

        return this;
    }

    /**
     * Get url
     * @return url
     */
    public ValueInAttributes getUrl() {
        return url;
    }

    public void setUrl(ValueInAttributes url) {
        this.url = url;
    }

    public AccessConfig withSecMode(ValueInAttributes secMode) {
        this.secMode = secMode;
        return this;
    }

    public AccessConfig withSecMode(Consumer<ValueInAttributes> secModeSetter) {
        if (this.secMode == null) {
            this.secMode = new ValueInAttributes();
            secModeSetter.accept(this.secMode);
        }

        return this;
    }

    /**
     * Get secMode
     * @return secMode
     */
    public ValueInAttributes getSecMode() {
        return secMode;
    }

    public void setSecMode(ValueInAttributes secMode) {
        this.secMode = secMode;
    }

    public AccessConfig withSecPolicy(ValueInAttributes secPolicy) {
        this.secPolicy = secPolicy;
        return this;
    }

    public AccessConfig withSecPolicy(Consumer<ValueInAttributes> secPolicySetter) {
        if (this.secPolicy == null) {
            this.secPolicy = new ValueInAttributes();
            secPolicySetter.accept(this.secPolicy);
        }

        return this;
    }

    /**
     * Get secPolicy
     * @return secPolicy
     */
    public ValueInAttributes getSecPolicy() {
        return secPolicy;
    }

    public void setSecPolicy(ValueInAttributes secPolicy) {
        this.secPolicy = secPolicy;
    }

    public AccessConfig withAuthType(ValueInAttributes authType) {
        this.authType = authType;
        return this;
    }

    public AccessConfig withAuthType(Consumer<ValueInAttributes> authTypeSetter) {
        if (this.authType == null) {
            this.authType = new ValueInAttributes();
            authTypeSetter.accept(this.authType);
        }

        return this;
    }

    /**
     * Get authType
     * @return authType
     */
    public ValueInAttributes getAuthType() {
        return authType;
    }

    public void setAuthType(ValueInAttributes authType) {
        this.authType = authType;
    }

    public AccessConfig withUsername(ValueInAttributes username) {
        this.username = username;
        return this;
    }

    public AccessConfig withUsername(Consumer<ValueInAttributes> usernameSetter) {
        if (this.username == null) {
            this.username = new ValueInAttributes();
            usernameSetter.accept(this.username);
        }

        return this;
    }

    /**
     * Get username
     * @return username
     */
    public ValueInAttributes getUsername() {
        return username;
    }

    public void setUsername(ValueInAttributes username) {
        this.username = username;
    }

    public AccessConfig withPassword(ValueInAttributes password) {
        this.password = password;
        return this;
    }

    public AccessConfig withPassword(Consumer<ValueInAttributes> passwordSetter) {
        if (this.password == null) {
            this.password = new ValueInAttributes();
            passwordSetter.accept(this.password);
        }

        return this;
    }

    /**
     * Get password
     * @return password
     */
    public ValueInAttributes getPassword() {
        return password;
    }

    public void setPassword(ValueInAttributes password) {
        this.password = password;
    }

    public AccessConfig withPrivateKey(ValueInAttributes privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public AccessConfig withPrivateKey(Consumer<ValueInAttributes> privateKeySetter) {
        if (this.privateKey == null) {
            this.privateKey = new ValueInAttributes();
            privateKeySetter.accept(this.privateKey);
        }

        return this;
    }

    /**
     * Get privateKey
     * @return privateKey
     */
    public ValueInAttributes getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(ValueInAttributes privateKey) {
        this.privateKey = privateKey;
    }

    public AccessConfig withCertificate(ValueInAttributes certificate) {
        this.certificate = certificate;
        return this;
    }

    public AccessConfig withCertificate(Consumer<ValueInAttributes> certificateSetter) {
        if (this.certificate == null) {
            this.certificate = new ValueInAttributes();
            certificateSetter.accept(this.certificate);
        }

        return this;
    }

    /**
     * Get certificate
     * @return certificate
     */
    public ValueInAttributes getCertificate() {
        return certificate;
    }

    public void setCertificate(ValueInAttributes certificate) {
        this.certificate = certificate;
    }

    public AccessConfig withTimeout(ValueInAttributes timeout) {
        this.timeout = timeout;
        return this;
    }

    public AccessConfig withTimeout(Consumer<ValueInAttributes> timeoutSetter) {
        if (this.timeout == null) {
            this.timeout = new ValueInAttributes();
            timeoutSetter.accept(this.timeout);
        }

        return this;
    }

    /**
     * Get timeout
     * @return timeout
     */
    public ValueInAttributes getTimeout() {
        return timeout;
    }

    public void setTimeout(ValueInAttributes timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessConfig that = (AccessConfig) obj;
        return Objects.equals(this.protocolType, that.protocolType)
            && Objects.equals(this.protocolName, that.protocolName) && Objects.equals(this.slaveId, that.slaveId)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.port, that.port)
            && Objects.equals(this.serialPort, that.serialPort) && Objects.equals(this.baudRate, that.baudRate)
            && Objects.equals(this.dataBits, that.dataBits) && Objects.equals(this.stopBits, that.stopBits)
            && Objects.equals(this.parityBits, that.parityBits) && Objects.equals(this.url, that.url)
            && Objects.equals(this.secMode, that.secMode) && Objects.equals(this.secPolicy, that.secPolicy)
            && Objects.equals(this.authType, that.authType) && Objects.equals(this.username, that.username)
            && Objects.equals(this.password, that.password) && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.certificate, that.certificate) && Objects.equals(this.timeout, that.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocolType,
            protocolName,
            slaveId,
            ip,
            port,
            serialPort,
            baudRate,
            dataBits,
            stopBits,
            parityBits,
            url,
            secMode,
            secPolicy,
            authType,
            username,
            password,
            privateKey,
            certificate,
            timeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfig {\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    protocolName: ").append(toIndentedString(protocolName)).append("\n");
        sb.append("    slaveId: ").append(toIndentedString(slaveId)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    serialPort: ").append(toIndentedString(serialPort)).append("\n");
        sb.append("    baudRate: ").append(toIndentedString(baudRate)).append("\n");
        sb.append("    dataBits: ").append(toIndentedString(dataBits)).append("\n");
        sb.append("    stopBits: ").append(toIndentedString(stopBits)).append("\n");
        sb.append("    parityBits: ").append(toIndentedString(parityBits)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    secMode: ").append(toIndentedString(secMode)).append("\n");
        sb.append("    secPolicy: ").append(toIndentedString(secPolicy)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
