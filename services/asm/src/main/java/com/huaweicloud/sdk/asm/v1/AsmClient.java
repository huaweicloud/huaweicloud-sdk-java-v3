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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AsmClient {

    protected HcClient hcClient;

    public AsmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AsmClient> newBuilder() {
        ClientBuilder<AsmClient> clientBuilder = new ClientBuilder<>(AsmClient::new, "BasicCredentials");
        return clientBuilder;
    }

    /**
     * 创建网格
     *
     * 该API用于创建一个网格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMeshRequest 请求对象
     * @return CreateMeshResponse
     */
    public CreateMeshResponse createMesh(CreateMeshRequest request) {
        return hcClient.syncInvokeHttp(request, AsmMeta.createMesh);
    }

    /**
     * 创建网格
     *
     * 该API用于创建一个网格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMeshRequest 请求对象
     * @return SyncInvoker<CreateMeshRequest, CreateMeshResponse>
     */
    public SyncInvoker<CreateMeshRequest, CreateMeshResponse> createMeshInvoker(CreateMeshRequest request) {
        return new SyncInvoker<>(request, AsmMeta.createMesh, hcClient);
    }

    /**
     * 删除网格
     *
     * 该API用于删除一个指定的网格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMeshRequest 请求对象
     * @return DeleteMeshResponse
     */
    public DeleteMeshResponse deleteMesh(DeleteMeshRequest request) {
        return hcClient.syncInvokeHttp(request, AsmMeta.deleteMesh);
    }

    /**
     * 删除网格
     *
     * 该API用于删除一个指定的网格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMeshRequest 请求对象
     * @return SyncInvoker<DeleteMeshRequest, DeleteMeshResponse>
     */
    public SyncInvoker<DeleteMeshRequest, DeleteMeshResponse> deleteMeshInvoker(DeleteMeshRequest request) {
        return new SyncInvoker<>(request, AsmMeta.deleteMesh, hcClient);
    }

    /**
     * 查询网格列表
     *
     * 该API用于获取用户所有网格的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMeshesRequest 请求对象
     * @return ListMeshesResponse
     */
    public ListMeshesResponse listMeshes(ListMeshesRequest request) {
        return hcClient.syncInvokeHttp(request, AsmMeta.listMeshes);
    }

    /**
     * 查询网格列表
     *
     * 该API用于获取用户所有网格的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMeshesRequest 请求对象
     * @return SyncInvoker<ListMeshesRequest, ListMeshesResponse>
     */
    public SyncInvoker<ListMeshesRequest, ListMeshesResponse> listMeshesInvoker(ListMeshesRequest request) {
        return new SyncInvoker<>(request, AsmMeta.listMeshes, hcClient);
    }

    /**
     * 查询网格
     *
     * 该API用于获取指定网格的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeshRequest 请求对象
     * @return ShowMeshResponse
     */
    public ShowMeshResponse showMesh(ShowMeshRequest request) {
        return hcClient.syncInvokeHttp(request, AsmMeta.showMesh);
    }

    /**
     * 查询网格
     *
     * 该API用于获取指定网格的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeshRequest 请求对象
     * @return SyncInvoker<ShowMeshRequest, ShowMeshResponse>
     */
    public SyncInvoker<ShowMeshRequest, ShowMeshResponse> showMeshInvoker(ShowMeshRequest request) {
        return new SyncInvoker<>(request, AsmMeta.showMesh, hcClient);
    }

}
