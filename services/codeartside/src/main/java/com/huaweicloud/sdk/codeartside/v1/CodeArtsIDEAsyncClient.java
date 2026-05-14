package com.huaweicloud.sdk.codeartside.v1;

import com.huaweicloud.sdk.codeartside.v1.model.ShowLatestUpgradableReleaseRequest;
import com.huaweicloud.sdk.codeartside.v1.model.ShowLatestUpgradableReleaseResponse;
import com.huaweicloud.sdk.codeartside.v1.model.ValidateWhitelistUserRequest;
import com.huaweicloud.sdk.codeartside.v1.model.ValidateWhitelistUserResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsIDEAsyncClient {

    protected HcClient hcClient;

    public CodeArtsIDEAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsIDEAsyncClient> newBuilder() {
        ClientBuilder<CodeArtsIDEAsyncClient> clientBuilder = new ClientBuilder<>(CodeArtsIDEAsyncClient::new);
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
     * @return CompletableFuture<ShowLatestUpgradableReleaseResponse>
     */
    public CompletableFuture<ShowLatestUpgradableReleaseResponse> showLatestUpgradableReleaseAsync(
        ShowLatestUpgradableReleaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsIDEMeta.showLatestUpgradableRelease);
    }

    /**
     * 查询升级版本
     *
     * 查询升级版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestUpgradableReleaseRequest 请求对象
     * @return AsyncInvoker<ShowLatestUpgradableReleaseRequest, ShowLatestUpgradableReleaseResponse>
     */
    public AsyncInvoker<ShowLatestUpgradableReleaseRequest, ShowLatestUpgradableReleaseResponse> showLatestUpgradableReleaseAsyncInvoker(
        ShowLatestUpgradableReleaseRequest request) {
        return new AsyncInvoker<>(request, CodeArtsIDEMeta.showLatestUpgradableRelease, hcClient);
    }

    /**
     * 是否白名单用户
     *
     * 是否白名单用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWhitelistUserRequest 请求对象
     * @return CompletableFuture<ValidateWhitelistUserResponse>
     */
    public CompletableFuture<ValidateWhitelistUserResponse> validateWhitelistUserAsync(
        ValidateWhitelistUserRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsIDEMeta.validateWhitelistUser);
    }

    /**
     * 是否白名单用户
     *
     * 是否白名单用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWhitelistUserRequest 请求对象
     * @return AsyncInvoker<ValidateWhitelistUserRequest, ValidateWhitelistUserResponse>
     */
    public AsyncInvoker<ValidateWhitelistUserRequest, ValidateWhitelistUserResponse> validateWhitelistUserAsyncInvoker(
        ValidateWhitelistUserRequest request) {
        return new AsyncInvoker<>(request, CodeArtsIDEMeta.validateWhitelistUser, hcClient);
    }

}
