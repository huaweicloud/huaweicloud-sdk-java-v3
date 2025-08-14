package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略类。
 */
public class Policies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peripherals")

    private PoliciesPeripherals peripherals;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private PoliciesAudio audio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    private PoliciesClient client;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display")

    private PoliciesDisplay display;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_and_clipboard")

    private PoliciesFileAndClipboard fileAndClipboard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session")

    private Session session;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_channel")

    private VirtualChannel virtualChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyboard_mouse")

    private PoliciesKeyboardMouse keyboardMouse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Bandwidth bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom")

    private PoliciesCustom custom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_storage")

    private PoliciesCloudStorage cloudStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_profile")

    private PoliciesUserProfile userProfile;

    public Policies withPeripherals(PoliciesPeripherals peripherals) {
        this.peripherals = peripherals;
        return this;
    }

    public Policies withPeripherals(Consumer<PoliciesPeripherals> peripheralsSetter) {
        if (this.peripherals == null) {
            this.peripherals = new PoliciesPeripherals();
            peripheralsSetter.accept(this.peripherals);
        }

        return this;
    }

    /**
     * Get peripherals
     * @return peripherals
     */
    public PoliciesPeripherals getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(PoliciesPeripherals peripherals) {
        this.peripherals = peripherals;
    }

    public Policies withAudio(PoliciesAudio audio) {
        this.audio = audio;
        return this;
    }

    public Policies withAudio(Consumer<PoliciesAudio> audioSetter) {
        if (this.audio == null) {
            this.audio = new PoliciesAudio();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    /**
     * Get audio
     * @return audio
     */
    public PoliciesAudio getAudio() {
        return audio;
    }

    public void setAudio(PoliciesAudio audio) {
        this.audio = audio;
    }

    public Policies withClient(PoliciesClient client) {
        this.client = client;
        return this;
    }

    public Policies withClient(Consumer<PoliciesClient> clientSetter) {
        if (this.client == null) {
            this.client = new PoliciesClient();
            clientSetter.accept(this.client);
        }

        return this;
    }

    /**
     * Get client
     * @return client
     */
    public PoliciesClient getClient() {
        return client;
    }

    public void setClient(PoliciesClient client) {
        this.client = client;
    }

    public Policies withDisplay(PoliciesDisplay display) {
        this.display = display;
        return this;
    }

    public Policies withDisplay(Consumer<PoliciesDisplay> displaySetter) {
        if (this.display == null) {
            this.display = new PoliciesDisplay();
            displaySetter.accept(this.display);
        }

        return this;
    }

    /**
     * Get display
     * @return display
     */
    public PoliciesDisplay getDisplay() {
        return display;
    }

    public void setDisplay(PoliciesDisplay display) {
        this.display = display;
    }

    public Policies withFileAndClipboard(PoliciesFileAndClipboard fileAndClipboard) {
        this.fileAndClipboard = fileAndClipboard;
        return this;
    }

    public Policies withFileAndClipboard(Consumer<PoliciesFileAndClipboard> fileAndClipboardSetter) {
        if (this.fileAndClipboard == null) {
            this.fileAndClipboard = new PoliciesFileAndClipboard();
            fileAndClipboardSetter.accept(this.fileAndClipboard);
        }

        return this;
    }

    /**
     * Get fileAndClipboard
     * @return fileAndClipboard
     */
    public PoliciesFileAndClipboard getFileAndClipboard() {
        return fileAndClipboard;
    }

    public void setFileAndClipboard(PoliciesFileAndClipboard fileAndClipboard) {
        this.fileAndClipboard = fileAndClipboard;
    }

    public Policies withSession(Session session) {
        this.session = session;
        return this;
    }

    public Policies withSession(Consumer<Session> sessionSetter) {
        if (this.session == null) {
            this.session = new Session();
            sessionSetter.accept(this.session);
        }

        return this;
    }

    /**
     * Get session
     * @return session
     */
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Policies withVirtualChannel(VirtualChannel virtualChannel) {
        this.virtualChannel = virtualChannel;
        return this;
    }

    public Policies withVirtualChannel(Consumer<VirtualChannel> virtualChannelSetter) {
        if (this.virtualChannel == null) {
            this.virtualChannel = new VirtualChannel();
            virtualChannelSetter.accept(this.virtualChannel);
        }

        return this;
    }

    /**
     * Get virtualChannel
     * @return virtualChannel
     */
    public VirtualChannel getVirtualChannel() {
        return virtualChannel;
    }

    public void setVirtualChannel(VirtualChannel virtualChannel) {
        this.virtualChannel = virtualChannel;
    }

    public Policies withKeyboardMouse(PoliciesKeyboardMouse keyboardMouse) {
        this.keyboardMouse = keyboardMouse;
        return this;
    }

    public Policies withKeyboardMouse(Consumer<PoliciesKeyboardMouse> keyboardMouseSetter) {
        if (this.keyboardMouse == null) {
            this.keyboardMouse = new PoliciesKeyboardMouse();
            keyboardMouseSetter.accept(this.keyboardMouse);
        }

        return this;
    }

    /**
     * Get keyboardMouse
     * @return keyboardMouse
     */
    public PoliciesKeyboardMouse getKeyboardMouse() {
        return keyboardMouse;
    }

    public void setKeyboardMouse(PoliciesKeyboardMouse keyboardMouse) {
        this.keyboardMouse = keyboardMouse;
    }

    public Policies withBandwidth(Bandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public Policies withBandwidth(Consumer<Bandwidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new Bandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public Bandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Bandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Policies withCustom(PoliciesCustom custom) {
        this.custom = custom;
        return this;
    }

    public Policies withCustom(Consumer<PoliciesCustom> customSetter) {
        if (this.custom == null) {
            this.custom = new PoliciesCustom();
            customSetter.accept(this.custom);
        }

        return this;
    }

    /**
     * Get custom
     * @return custom
     */
    public PoliciesCustom getCustom() {
        return custom;
    }

    public void setCustom(PoliciesCustom custom) {
        this.custom = custom;
    }

    public Policies withCloudStorage(PoliciesCloudStorage cloudStorage) {
        this.cloudStorage = cloudStorage;
        return this;
    }

    public Policies withCloudStorage(Consumer<PoliciesCloudStorage> cloudStorageSetter) {
        if (this.cloudStorage == null) {
            this.cloudStorage = new PoliciesCloudStorage();
            cloudStorageSetter.accept(this.cloudStorage);
        }

        return this;
    }

    /**
     * Get cloudStorage
     * @return cloudStorage
     */
    public PoliciesCloudStorage getCloudStorage() {
        return cloudStorage;
    }

    public void setCloudStorage(PoliciesCloudStorage cloudStorage) {
        this.cloudStorage = cloudStorage;
    }

    public Policies withUserProfile(PoliciesUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }

    public Policies withUserProfile(Consumer<PoliciesUserProfile> userProfileSetter) {
        if (this.userProfile == null) {
            this.userProfile = new PoliciesUserProfile();
            userProfileSetter.accept(this.userProfile);
        }

        return this;
    }

    /**
     * Get userProfile
     * @return userProfile
     */
    public PoliciesUserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(PoliciesUserProfile userProfile) {
        this.userProfile = userProfile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Policies that = (Policies) obj;
        return Objects.equals(this.peripherals, that.peripherals) && Objects.equals(this.audio, that.audio)
            && Objects.equals(this.client, that.client) && Objects.equals(this.display, that.display)
            && Objects.equals(this.fileAndClipboard, that.fileAndClipboard)
            && Objects.equals(this.session, that.session) && Objects.equals(this.virtualChannel, that.virtualChannel)
            && Objects.equals(this.keyboardMouse, that.keyboardMouse) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.custom, that.custom) && Objects.equals(this.cloudStorage, that.cloudStorage)
            && Objects.equals(this.userProfile, that.userProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peripherals,
            audio,
            client,
            display,
            fileAndClipboard,
            session,
            virtualChannel,
            keyboardMouse,
            bandwidth,
            custom,
            cloudStorage,
            userProfile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Policies {\n");
        sb.append("    peripherals: ").append(toIndentedString(peripherals)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    fileAndClipboard: ").append(toIndentedString(fileAndClipboard)).append("\n");
        sb.append("    session: ").append(toIndentedString(session)).append("\n");
        sb.append("    virtualChannel: ").append(toIndentedString(virtualChannel)).append("\n");
        sb.append("    keyboardMouse: ").append(toIndentedString(keyboardMouse)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    cloudStorage: ").append(toIndentedString(cloudStorage)).append("\n");
        sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
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
