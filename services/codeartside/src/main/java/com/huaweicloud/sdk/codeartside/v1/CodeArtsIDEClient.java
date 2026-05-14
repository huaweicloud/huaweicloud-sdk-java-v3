package com.huaweicloud.sdk.codeartside.v1;

import com.huaweicloud.sdk.codeartside.v1.model.ShowLatestUpgradableReleaseRequest;
import com.huaweicloud.sdk.codeartside.v1.model.ShowLatestUpgradableReleaseResponse;
import com.huaweicloud.sdk.codeartside.v1.model.ValidateWhitelistUserRequest;
import com.huaweicloud.sdk.codeartside.v1.model.ValidateWhitelistUserResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsIDEClient {

    protected HcClient hcClient;

    public CodeArtsIDEClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsIDEClient> newBuilder() {
        ClientBuilder<CodeArtsIDEClient> clientBuilder = new ClientBuilder<>(CodeArtsIDEClient::new);
        return clientBuilder;
    }

    /**
     * 查询升级版本
     *
     * 查询升级版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestUpgradableReleaseRequest 请求对象
     * @return ShowLatestUpgradableReleaseResponse
     */
    public ShowLatestUpgradableReleaseResponse showLatestUpgradableRelease(ShowLatestUpgradableReleaseRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsIDEMeta.showLatestUpgradableRelease);
    }

    /**
     * 查询升级版本
     *
     * 查询升级版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestUpgradableReleaseRequest 请求对象
     * @return SyncInvoker<ShowLatestUpgradableReleaseRequest, ShowLatestUpgradableReleaseResponse>
     */
    public SyncInvoker<ShowLatestUpgradableReleaseRequest, ShowLatestUpgradableReleaseResponse> showLatestUpgradableReleaseInvoker(
        ShowLatestUpgradableReleaseRequest request) {
        return new SyncInvoker<>(request, CodeArtsIDEMeta.showLatestUpgradableRelease, hcClient);
    }

    /**
     * 是否白名单用户
     *
     * 是否白名单用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWhitelistUserRequest 请求对象
     * @return ValidateWhitelistUserResponse
     */
    public ValidateWhitelistUserResponse validateWhitelistUser(ValidateWhitelistUserRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsIDEMeta.validateWhitelistUser);
    }

    /**
     * 是否白名单用户
     *
     * 是否白名单用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWhitelistUserRequest 请求对象
     * @return SyncInvoker<ValidateWhitelistUserRequest, ValidateWhitelistUserResponse>
     */
    public SyncInvoker<ValidateWhitelistUserRequest, ValidateWhitelistUserResponse> validateWhitelistUserInvoker(
        ValidateWhitelistUserRequest request) {
        return new SyncInvoker<>(request, CodeArtsIDEMeta.validateWhitelistUser, hcClient);
    }

}
