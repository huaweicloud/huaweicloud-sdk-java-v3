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

    private AccessConfigProtocolType protocolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_name")

    private AccessConfigProtocolName protocolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_id")

    private AccessConfigSlaveId slaveId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private AccessConfigIp ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private AccessConfigPort port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_port")

    private AccessConfigSerialPort serialPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baud_rate")

    private AccessConfigBaudRate baudRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_bits")

    private AccessConfigDataBits dataBits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_bits")

    private AccessConfigStopBits stopBits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parity_bits")

    private AccessConfigParityBits parityBits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private AccessConfigUrl url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sec_mode")

    private AccessConfigSecMode secMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sec_policy")

    private AccessConfigSecPolicy secPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AccessConfigAuthType authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private AccessConfigUsername username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private AccessConfigPassword password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private AccessConfigPrivateKey privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private AccessConfigCertificate certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private AccessConfigTimeout timeout;

    public AccessConfig withProtocolType(AccessConfigProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    public AccessConfig withProtocolType(Consumer<AccessConfigProtocolType> protocolTypeSetter) {
        if (this.protocolType == null) {
            this.protocolType = new AccessConfigProtocolType();
            protocolTypeSetter.accept(this.protocolType);
        }

        return this;
    }

    /**
     * Get protocolType
     * @return protocolType
     */
    public AccessConfigProtocolType getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(AccessConfigProtocolType protocolType) {
        this.protocolType = protocolType;
    }

    public AccessConfig withProtocolName(AccessConfigProtocolName protocolName) {
        this.protocolName = protocolName;
        return this;
    }

    public AccessConfig withProtocolName(Consumer<AccessConfigProtocolName> protocolNameSetter) {
        if (this.protocolName == null) {
            this.protocolName = new AccessConfigProtocolName();
            protocolNameSetter.accept(this.protocolName);
        }

        return this;
    }

    /**
     * Get protocolName
     * @return protocolName
     */
    public AccessConfigProtocolName getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(AccessConfigProtocolName protocolName) {
        this.protocolName = protocolName;
    }

    public AccessConfig withSlaveId(AccessConfigSlaveId slaveId) {
        this.slaveId = slaveId;
        return this;
    }

    public AccessConfig withSlaveId(Consumer<AccessConfigSlaveId> slaveIdSetter) {
        if (this.slaveId == null) {
            this.slaveId = new AccessConfigSlaveId();
            slaveIdSetter.accept(this.slaveId);
        }

        return this;
    }

    /**
     * Get slaveId
     * @return slaveId
     */
    public AccessConfigSlaveId getSlaveId() {
        return slaveId;
    }

    public void setSlaveId(AccessConfigSlaveId slaveId) {
        this.slaveId = slaveId;
    }

    public AccessConfig withIp(AccessConfigIp ip) {
        this.ip = ip;
        return this;
    }

    public AccessConfig withIp(Consumer<AccessConfigIp> ipSetter) {
        if (this.ip == null) {
            this.ip = new AccessConfigIp();
            ipSetter.accept(this.ip);
        }

        return this;
    }

    /**
     * Get ip
     * @return ip
     */
    public AccessConfigIp getIp() {
        return ip;
    }

    public void setIp(AccessConfigIp ip) {
        this.ip = ip;
    }

    public AccessConfig withPort(AccessConfigPort port) {
        this.port = port;
        return this;
    }

    public AccessConfig withPort(Consumer<AccessConfigPort> portSetter) {
        if (this.port == null) {
            this.port = new AccessConfigPort();
            portSetter.accept(this.port);
        }

        return this;
    }

    /**
     * Get port
     * @return port
     */
    public AccessConfigPort getPort() {
        return port;
    }

    public void setPort(AccessConfigPort port) {
        this.port = port;
    }

    public AccessConfig withSerialPort(AccessConfigSerialPort serialPort) {
        this.serialPort = serialPort;
        return this;
    }

    public AccessConfig withSerialPort(Consumer<AccessConfigSerialPort> serialPortSetter) {
        if (this.serialPort == null) {
            this.serialPort = new AccessConfigSerialPort();
            serialPortSetter.accept(this.serialPort);
        }

        return this;
    }

    /**
     * Get serialPort
     * @return serialPort
     */
    public AccessConfigSerialPort getSerialPort() {
        return serialPort;
    }

    public void setSerialPort(AccessConfigSerialPort serialPort) {
        this.serialPort = serialPort;
    }

    public AccessConfig withBaudRate(AccessConfigBaudRate baudRate) {
        this.baudRate = baudRate;
        return this;
    }

    public AccessConfig withBaudRate(Consumer<AccessConfigBaudRate> baudRateSetter) {
        if (this.baudRate == null) {
            this.baudRate = new AccessConfigBaudRate();
            baudRateSetter.accept(this.baudRate);
        }

        return this;
    }

    /**
     * Get baudRate
     * @return baudRate
     */
    public AccessConfigBaudRate getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(AccessConfigBaudRate baudRate) {
        this.baudRate = baudRate;
    }

    public AccessConfig withDataBits(AccessConfigDataBits dataBits) {
        this.dataBits = dataBits;
        return this;
    }

    public AccessConfig withDataBits(Consumer<AccessConfigDataBits> dataBitsSetter) {
        if (this.dataBits == null) {
            this.dataBits = new AccessConfigDataBits();
            dataBitsSetter.accept(this.dataBits);
        }

        return this;
    }

    /**
     * Get dataBits
     * @return dataBits
     */
    public AccessConfigDataBits getDataBits() {
        return dataBits;
    }

    public void setDataBits(AccessConfigDataBits dataBits) {
        this.dataBits = dataBits;
    }

    public AccessConfig withStopBits(AccessConfigStopBits stopBits) {
        this.stopBits = stopBits;
        return this;
    }

    public AccessConfig withStopBits(Consumer<AccessConfigStopBits> stopBitsSetter) {
        if (this.stopBits == null) {
            this.stopBits = new AccessConfigStopBits();
            stopBitsSetter.accept(this.stopBits);
        }

        return this;
    }

    /**
     * Get stopBits
     * @return stopBits
     */
    public AccessConfigStopBits getStopBits() {
        return stopBits;
    }

    public void setStopBits(AccessConfigStopBits stopBits) {
        this.stopBits = stopBits;
    }

    public AccessConfig withParityBits(AccessConfigParityBits parityBits) {
        this.parityBits = parityBits;
        return this;
    }

    public AccessConfig withParityBits(Consumer<AccessConfigParityBits> parityBitsSetter) {
        if (this.parityBits == null) {
            this.parityBits = new AccessConfigParityBits();
            parityBitsSetter.accept(this.parityBits);
        }

        return this;
    }

    /**
     * Get parityBits
     * @return parityBits
     */
    public AccessConfigParityBits getParityBits() {
        return parityBits;
    }

    public void setParityBits(AccessConfigParityBits parityBits) {
        this.parityBits = parityBits;
    }

    public AccessConfig withUrl(AccessConfigUrl url) {
        this.url = url;
        return this;
    }

    public AccessConfig withUrl(Consumer<AccessConfigUrl> urlSetter) {
        if (this.url == null) {
            this.url = new AccessConfigUrl();
            urlSetter.accept(this.url);
        }

        return this;
    }

    /**
     * Get url
     * @return url
     */
    public AccessConfigUrl getUrl() {
        return url;
    }

    public void setUrl(AccessConfigUrl url) {
        this.url = url;
    }

    public AccessConfig withSecMode(AccessConfigSecMode secMode) {
        this.secMode = secMode;
        return this;
    }

    public AccessConfig withSecMode(Consumer<AccessConfigSecMode> secModeSetter) {
        if (this.secMode == null) {
            this.secMode = new AccessConfigSecMode();
            secModeSetter.accept(this.secMode);
        }

        return this;
    }

    /**
     * Get secMode
     * @return secMode
     */
    public AccessConfigSecMode getSecMode() {
        return secMode;
    }

    public void setSecMode(AccessConfigSecMode secMode) {
        this.secMode = secMode;
    }

    public AccessConfig withSecPolicy(AccessConfigSecPolicy secPolicy) {
        this.secPolicy = secPolicy;
        return this;
    }

    public AccessConfig withSecPolicy(Consumer<AccessConfigSecPolicy> secPolicySetter) {
        if (this.secPolicy == null) {
            this.secPolicy = new AccessConfigSecPolicy();
            secPolicySetter.accept(this.secPolicy);
        }

        return this;
    }

    /**
     * Get secPolicy
     * @return secPolicy
     */
    public AccessConfigSecPolicy getSecPolicy() {
        return secPolicy;
    }

    public void setSecPolicy(AccessConfigSecPolicy secPolicy) {
        this.secPolicy = secPolicy;
    }

    public AccessConfig withAuthType(AccessConfigAuthType authType) {
        this.authType = authType;
        return this;
    }

    public AccessConfig withAuthType(Consumer<AccessConfigAuthType> authTypeSetter) {
        if (this.authType == null) {
            this.authType = new AccessConfigAuthType();
            authTypeSetter.accept(this.authType);
        }

        return this;
    }

    /**
     * Get authType
     * @return authType
     */
    public AccessConfigAuthType getAuthType() {
        return authType;
    }

    public void setAuthType(AccessConfigAuthType authType) {
        this.authType = authType;
    }

    public AccessConfig withUsername(AccessConfigUsername username) {
        this.username = username;
        return this;
    }

    public AccessConfig withUsername(Consumer<AccessConfigUsername> usernameSetter) {
        if (this.username == null) {
            this.username = new AccessConfigUsername();
            usernameSetter.accept(this.username);
        }

        return this;
    }

    /**
     * Get username
     * @return username
     */
    public AccessConfigUsername getUsername() {
        return username;
    }

    public void setUsername(AccessConfigUsername username) {
        this.username = username;
    }

    public AccessConfig withPassword(AccessConfigPassword password) {
        this.password = password;
        return this;
    }

    public AccessConfig withPassword(Consumer<AccessConfigPassword> passwordSetter) {
        if (this.password == null) {
            this.password = new AccessConfigPassword();
            passwordSetter.accept(this.password);
        }

        return this;
    }

    /**
     * Get password
     * @return password
     */
    public AccessConfigPassword getPassword() {
        return password;
    }

    public void setPassword(AccessConfigPassword password) {
        this.password = password;
    }

    public AccessConfig withPrivateKey(AccessConfigPrivateKey privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public AccessConfig withPrivateKey(Consumer<AccessConfigPrivateKey> privateKeySetter) {
        if (this.privateKey == null) {
            this.privateKey = new AccessConfigPrivateKey();
            privateKeySetter.accept(this.privateKey);
        }

        return this;
    }

    /**
     * Get privateKey
     * @return privateKey
     */
    public AccessConfigPrivateKey getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(AccessConfigPrivateKey privateKey) {
        this.privateKey = privateKey;
    }

    public AccessConfig withCertificate(AccessConfigCertificate certificate) {
        this.certificate = certificate;
        return this;
    }

    public AccessConfig withCertificate(Consumer<AccessConfigCertificate> certificateSetter) {
        if (this.certificate == null) {
            this.certificate = new AccessConfigCertificate();
            certificateSetter.accept(this.certificate);
        }

        return this;
    }

    /**
     * Get certificate
     * @return certificate
     */
    public AccessConfigCertificate getCertificate() {
        return certificate;
    }

    public void setCertificate(AccessConfigCertificate certificate) {
        this.certificate = certificate;
    }

    public AccessConfig withTimeout(AccessConfigTimeout timeout) {
        this.timeout = timeout;
        return this;
    }

    public AccessConfig withTimeout(Consumer<AccessConfigTimeout> timeoutSetter) {
        if (this.timeout == null) {
            this.timeout = new AccessConfigTimeout();
            timeoutSetter.accept(this.timeout);
        }

        return this;
    }

    /**
     * Get timeout
     * @return timeout
     */
    public AccessConfigTimeout getTimeout() {
        return timeout;
    }

    public void setTimeout(AccessConfigTimeout timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessConfig accessConfig = (AccessConfig) o;
        return Objects.equals(this.protocolType, accessConfig.protocolType)
            && Objects.equals(this.protocolName, accessConfig.protocolName)
            && Objects.equals(this.slaveId, accessConfig.slaveId) && Objects.equals(this.ip, accessConfig.ip)
            && Objects.equals(this.port, accessConfig.port) && Objects.equals(this.serialPort, accessConfig.serialPort)
            && Objects.equals(this.baudRate, accessConfig.baudRate)
            && Objects.equals(this.dataBits, accessConfig.dataBits)
            && Objects.equals(this.stopBits, accessConfig.stopBits)
            && Objects.equals(this.parityBits, accessConfig.parityBits) && Objects.equals(this.url, accessConfig.url)
            && Objects.equals(this.secMode, accessConfig.secMode)
            && Objects.equals(this.secPolicy, accessConfig.secPolicy)
            && Objects.equals(this.authType, accessConfig.authType)
            && Objects.equals(this.username, accessConfig.username)
            && Objects.equals(this.password, accessConfig.password)
            && Objects.equals(this.privateKey, accessConfig.privateKey)
            && Objects.equals(this.certificate, accessConfig.certificate)
            && Objects.equals(this.timeout, accessConfig.timeout);
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
