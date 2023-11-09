package com.huaweicloud.sdk.asm.v1;

import com.huaweicloud.sdk.asm.v1.model.CreateMeshRequest;
import com.huaweicloud.sdk.asm.v1.model.CreateMeshResponse;
import com.huaweicloud.sdk.asm.v1.model.DeleteMeshRequest;
import com.huaweicloud.sdk.asm.v1.model.DeleteMeshResponse;
import com.huaweicloud.sdk.asm.v1.model.ListMeshesRequest;
import com.huaweicloud.sdk.asm.v1.model.ListMeshesResponse;
import com.huaweicloud.sdk.asm.v1.model.ShowMeshRequest;
import com.huaweicloud.sdk.asm.v1.model.ShowMeshResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AsmAsyncClient {

    protected HcClient hcClient;

    public AsmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AsmAsyncClient> newBuilder() {
        ClientBuilder<AsmAsyncClient> clientBuilder = new ClientBuilder<>(AsmAsyncClient::new, "BasicCredentials");
        return clientBuilder;
    }

    /**
     * 创建网格
     *
     * 该API用于创建一个网格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMeshRequest 请求对象
     * @return CompletableFuture<CreateMeshResponse>
     */
    public CompletableFuture<CreateMeshResponse> createMeshAsync(CreateMeshRequest request) {
        return hcClient.asyncInvokeHttp(request, AsmMeta.createMesh);
    }

    /**
     * 创建网格
     *
     * 该API用于创建一个网格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMeshRequest 请求对象
     * @return AsyncInvoker<CreateMeshRequest, CreateMeshResponse>
     */
    public AsyncInvoker<CreateMeshRequest, CreateMeshResponse> createMeshAsyncInvoker(CreateMeshRequest request) {
        return new AsyncInvoker<CreateMeshRequest, CreateMeshResponse>(request, AsmMeta.createMesh, hcClient);
    }

    /**
     * 删除网格
     *
     * 该API用于删除一个指定的网格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMeshRequest 请求对象
     * @return CompletableFuture<DeleteMeshResponse>
     */
    public CompletableFuture<DeleteMeshResponse> deleteMeshAsync(DeleteMeshRequest request) {
        return hcClient.asyncInvokeHttp(request, AsmMeta.deleteMesh);
    }

    /**
     * 删除网格
     *
     * 该API用于删除一个指定的网格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMeshRequest 请求对象
     * @return AsyncInvoker<DeleteMeshRequest, DeleteMeshResponse>
     */
    public AsyncInvoker<DeleteMeshRequest, DeleteMeshResponse> deleteMeshAsyncInvoker(DeleteMeshRequest request) {
        return new AsyncInvoker<DeleteMeshRequest, DeleteMeshResponse>(request, AsmMeta.deleteMesh, hcClient);
    }

    /**
     * 查询网格列表
     *
     * 该API用于获取用户所有网格的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMeshesRequest 请求对象
     * @return CompletableFuture<ListMeshesResponse>
     */
    public CompletableFuture<ListMeshesResponse> listMeshesAsync(ListMeshesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsmMeta.listMeshes);
    }

    /**
     * 查询网格列表
     *
     * 该API用于获取用户所有网格的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMeshesRequest 请求对象
     * @return AsyncInvoker<ListMeshesRequest, ListMeshesResponse>
     */
    public AsyncInvoker<ListMeshesRequest, ListMeshesResponse> listMeshesAsyncInvoker(ListMeshesRequest request) {
        return new AsyncInvoker<ListMeshesRequest, ListMeshesResponse>(request, AsmMeta.listMeshes, hcClient);
    }

    /**
     * 查询网格
     *
     * 该API用于获取指定网格的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMeshRequest 请求对象
     * @return CompletableFuture<ShowMeshResponse>
     */
    public CompletableFuture<ShowMeshResponse> showMeshAsync(ShowMeshRequest request) {
        return hcClient.asyncInvokeHttp(request, AsmMeta.showMesh);
    }

    /**
     * 查询网格
     *
     * 该API用于获取指定网格的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMeshRequest 请求对象
     * @return AsyncInvoker<ShowMeshRequest, ShowMeshResponse>
     */
    public AsyncInvoker<ShowMeshRequest, ShowMeshResponse> showMeshAsyncInvoker(ShowMeshRequest request) {
        return new AsyncInvoker<ShowMeshRequest, ShowMeshResponse>(request, AsmMeta.showMesh, hcClient);
    }

}
