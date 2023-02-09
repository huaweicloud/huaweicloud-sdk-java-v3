package com.huaweicloud.sdk.lakeformation.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.lakeformation.v1.model.*;

public class LakeFormationClient {

    protected HcClient hcClient;

    public LakeFormationClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LakeFormationClient> newBuilder() {
        return new ClientBuilder<>(LakeFormationClient::new);
    }

    /**
     * 申请接入服务
     *
     * 申请接入服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyForAccessRequest 请求对象
     * @return ApplyForAccessResponse
     */
    public ApplyForAccessResponse applyForAccess(ApplyForAccessRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.applyForAccess);
    }

    /**
     * 申请接入服务
     *
     * 申请接入服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyForAccessRequest 请求对象
     * @return SyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse>
     */
    public SyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse> applyForAccessInvoker(
        ApplyForAccessRequest request) {
        return new SyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse>(request, LakeFormationMeta.applyForAccess,
            hcClient);
    }

    /**
     * 批量授权
     *
     * 批量授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAuthorizeInterfaceRequest 请求对象
     * @return BatchAuthorizeInterfaceResponse
     */
    public BatchAuthorizeInterfaceResponse batchAuthorizeInterface(BatchAuthorizeInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchAuthorizeInterface);
    }

    /**
     * 批量授权
     *
     * 批量授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAuthorizeInterfaceRequest 请求对象
     * @return SyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse>
     */
    public SyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse> batchAuthorizeInterfaceInvoker(
        BatchAuthorizeInterfaceRequest request) {
        return new SyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse>(request,
            LakeFormationMeta.batchAuthorizeInterface, hcClient);
    }

    /**
     * 取消批量授权
     *
     * 批量取消授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCancelAuthorizationInterfaceRequest 请求对象
     * @return BatchCancelAuthorizationInterfaceResponse
     */
    public BatchCancelAuthorizationInterfaceResponse batchCancelAuthorizationInterface(
        BatchCancelAuthorizationInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchCancelAuthorizationInterface);
    }

    /**
     * 取消批量授权
     *
     * 批量取消授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCancelAuthorizationInterfaceRequest 请求对象
     * @return SyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse>
     */
    public SyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse> batchCancelAuthorizationInterfaceInvoker(
        BatchCancelAuthorizationInterfaceRequest request) {
        return new SyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse>(
            request, LakeFormationMeta.batchCancelAuthorizationInterface, hcClient);
    }

    /**
     * 获取服务接入信息
     *
     * 根据LakeFormation实例获取服务实例相关的接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessInfosRequest 请求对象
     * @return ListAccessInfosResponse
     */
    public ListAccessInfosResponse listAccessInfos(ListAccessInfosRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listAccessInfos);
    }

    /**
     * 获取服务接入信息
     *
     * 根据LakeFormation实例获取服务实例相关的接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessInfosRequest 请求对象
     * @return SyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse>
     */
    public SyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse> listAccessInfosInvoker(
        ListAccessInfosRequest request) {
        return new SyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse>(request,
            LakeFormationMeta.listAccessInfos, hcClient);
    }

    /**
     * 查询策略
     *
     * 通过过滤条件查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInterfacesRequest 请求对象
     * @return ListInterfacesResponse
     */
    public ListInterfacesResponse listInterfaces(ListInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listInterfaces);
    }

    /**
     * 查询策略
     *
     * 通过过滤条件查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInterfacesRequest 请求对象
     * @return SyncInvoker<ListInterfacesRequest, ListInterfacesResponse>
     */
    public SyncInvoker<ListInterfacesRequest, ListInterfacesResponse> listInterfacesInvoker(
        ListInterfacesRequest request) {
        return new SyncInvoker<ListInterfacesRequest, ListInterfacesResponse>(request, LakeFormationMeta.listInterfaces,
            hcClient);
    }

    /**
     * 获取同步权限策略
     *
     * 获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncPolicyRequest 请求对象
     * @return ShowSyncPolicyResponse
     */
    public ShowSyncPolicyResponse showSyncPolicy(ShowSyncPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showSyncPolicy);
    }

    /**
     * 获取同步权限策略
     *
     * 获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncPolicyRequest 请求对象
     * @return SyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse>
     */
    public SyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse> showSyncPolicyInvoker(
        ShowSyncPolicyRequest request) {
        return new SyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse>(request, LakeFormationMeta.showSyncPolicy,
            hcClient);
    }

    /**
     * 创建catalog
     *
     * 创建catalog，会在catalog下创建默认数据库，默认数据库名字为：default
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCatalogRequest 请求对象
     * @return CreateCatalogResponse
     */
    public CreateCatalogResponse createCatalog(CreateCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createCatalog);
    }

    /**
     * 创建catalog
     *
     * 创建catalog，会在catalog下创建默认数据库，默认数据库名字为：default
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCatalogRequest 请求对象
     * @return SyncInvoker<CreateCatalogRequest, CreateCatalogResponse>
     */
    public SyncInvoker<CreateCatalogRequest, CreateCatalogResponse> createCatalogInvoker(CreateCatalogRequest request) {
        return new SyncInvoker<CreateCatalogRequest, CreateCatalogResponse>(request, LakeFormationMeta.createCatalog,
            hcClient);
    }

    /**
     * 删除catalog对象
     *
     * 删除空的catalog对象。
     * 删除前需要保证catalog下只有默认的数据库，且默认数据库下没有表对象，否则删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCatalogRequest 请求对象
     * @return DeleteCatalogResponse
     */
    public DeleteCatalogResponse deleteCatalog(DeleteCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteCatalog);
    }

    /**
     * 删除catalog对象
     *
     * 删除空的catalog对象。
     * 删除前需要保证catalog下只有默认的数据库，且默认数据库下没有表对象，否则删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCatalogRequest 请求对象
     * @return SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>
     */
    public SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalogInvoker(DeleteCatalogRequest request) {
        return new SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>(request, LakeFormationMeta.deleteCatalog,
            hcClient);
    }

    /**
     * 列举catalog信息
     *
     * 根据catalog名字的通配符列举catalog的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogsRequest 请求对象
     * @return ListCatalogsResponse
     */
    public ListCatalogsResponse listCatalogs(ListCatalogsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listCatalogs);
    }

    /**
     * 列举catalog信息
     *
     * 根据catalog名字的通配符列举catalog的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogsRequest 请求对象
     * @return SyncInvoker<ListCatalogsRequest, ListCatalogsResponse>
     */
    public SyncInvoker<ListCatalogsRequest, ListCatalogsResponse> listCatalogsInvoker(ListCatalogsRequest request) {
        return new SyncInvoker<ListCatalogsRequest, ListCatalogsResponse>(request, LakeFormationMeta.listCatalogs,
            hcClient);
    }

    /**
     * 获取catalog信息
     *
     * 获取catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCatalogRequest 请求对象
     * @return ShowCatalogResponse
     */
    public ShowCatalogResponse showCatalog(ShowCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showCatalog);
    }

    /**
     * 获取catalog信息
     *
     * 获取catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCatalogRequest 请求对象
     * @return SyncInvoker<ShowCatalogRequest, ShowCatalogResponse>
     */
    public SyncInvoker<ShowCatalogRequest, ShowCatalogResponse> showCatalogInvoker(ShowCatalogRequest request) {
        return new SyncInvoker<ShowCatalogRequest, ShowCatalogResponse>(request, LakeFormationMeta.showCatalog,
            hcClient);
    }

    /**
     * 修改catalog信息
     *
     * 修改catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCatalogRequest 请求对象
     * @return UpdateCatalogResponse
     */
    public UpdateCatalogResponse updateCatalog(UpdateCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateCatalog);
    }

    /**
     * 修改catalog信息
     *
     * 修改catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCatalogRequest 请求对象
     * @return SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>
     */
    public SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalogInvoker(UpdateCatalogRequest request) {
        return new SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>(request, LakeFormationMeta.updateCatalog,
            hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(
        CreateDatabaseRequest request) {
        return new SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, LakeFormationMeta.createDatabase,
            hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除指定数据库，catalog的默认数据库不允许删除。
     * cascade: 指定为true时，删除数据库下的表；指定为false时，只能删除空的数据库
     * delete_data: 指定为true时，级联删除会将表的数据放入回收站；指定为false时，不删除表数据
     * 删除数据库后不支持恢复数据库下的事务表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除指定数据库，catalog的默认数据库不允许删除。
     * cascade: 指定为true时，删除数据库下的表；指定为false时，只能删除空的数据库
     * delete_data: 指定为true时，级联删除会将表的数据放入回收站；指定为false时，不删除表数据
     * 删除数据库后不支持恢复数据库下的事务表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(
        DeleteDatabaseRequest request) {
        return new SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, LakeFormationMeta.deleteDatabase,
            hcClient);
    }

    /**
     * 列举数据库名称信息
     *
     * 列举数据库名称信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseNamesRequest 请求对象
     * @return ListDatabaseNamesResponse
     */
    public ListDatabaseNamesResponse listDatabaseNames(ListDatabaseNamesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listDatabaseNames);
    }

    /**
     * 列举数据库名称信息
     *
     * 列举数据库名称信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseNamesRequest 请求对象
     * @return SyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse>
     */
    public SyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse> listDatabaseNamesInvoker(
        ListDatabaseNamesRequest request) {
        return new SyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse>(request,
            LakeFormationMeta.listDatabaseNames, hcClient);
    }

    /**
     * 列举数据库信息
     *
     * 列举数据库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listDatabases);
    }

    /**
     * 列举数据库信息
     *
     * 列举数据库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, LakeFormationMeta.listDatabases,
            hcClient);
    }

    /**
     * 获取数据库
     *
     * 获取数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseRequest 请求对象
     * @return ShowDatabaseResponse
     */
    public ShowDatabaseResponse showDatabase(ShowDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showDatabase);
    }

    /**
     * 获取数据库
     *
     * 获取数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseRequest 请求对象
     * @return SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>
     */
    public SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse> showDatabaseInvoker(ShowDatabaseRequest request) {
        return new SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>(request, LakeFormationMeta.showDatabase,
            hcClient);
    }

    /**
     * 修改数据库属性
     *
     * 修改数据库属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return UpdateDatabaseResponse
     */
    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateDatabase);
    }

    /**
     * 修改数据库属性
     *
     * 修改数据库属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>
     */
    public SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabaseInvoker(
        UpdateDatabaseRequest request) {
        return new SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>(request, LakeFormationMeta.updateDatabase,
            hcClient);
    }

    /**
     * 创建函数
     *
     * 创建函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createFunction);
    }

    /**
     * 创建函数
     *
     * 创建函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return SyncInvoker<CreateFunctionRequest, CreateFunctionResponse>
     */
    public SyncInvoker<CreateFunctionRequest, CreateFunctionResponse> createFunctionInvoker(
        CreateFunctionRequest request) {
        return new SyncInvoker<CreateFunctionRequest, CreateFunctionResponse>(request, LakeFormationMeta.createFunction,
            hcClient);
    }

    /**
     * 删除函数
     *
     * 删除函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteFunction);
    }

    /**
     * 删除函数
     *
     * 删除函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>
     */
    public SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunctionInvoker(
        DeleteFunctionRequest request) {
        return new SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>(request, LakeFormationMeta.deleteFunction,
            hcClient);
    }

    /**
     * 列举catalog下所有的函数
     *
     * 获取catalog下所有的函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllFunctionsRequest 请求对象
     * @return ListAllFunctionsResponse
     */
    public ListAllFunctionsResponse listAllFunctions(ListAllFunctionsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listAllFunctions);
    }

    /**
     * 列举catalog下所有的函数
     *
     * 获取catalog下所有的函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllFunctionsRequest 请求对象
     * @return SyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse>
     */
    public SyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse> listAllFunctionsInvoker(
        ListAllFunctionsRequest request) {
        return new SyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse>(request,
            LakeFormationMeta.listAllFunctions, hcClient);
    }

    /**
     * 列举函数
     *
     * 列举函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listFunctions);
    }

    /**
     * 列举函数
     *
     * 列举函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return SyncInvoker<ListFunctionsRequest, ListFunctionsResponse>
     */
    public SyncInvoker<ListFunctionsRequest, ListFunctionsResponse> listFunctionsInvoker(ListFunctionsRequest request) {
        return new SyncInvoker<ListFunctionsRequest, ListFunctionsResponse>(request, LakeFormationMeta.listFunctions,
            hcClient);
    }

    /**
     * 查询函数
     *
     * 根据函数名称查询函数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionRequest 请求对象
     * @return ShowFunctionResponse
     */
    public ShowFunctionResponse showFunction(ShowFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showFunction);
    }

    /**
     * 查询函数
     *
     * 根据函数名称查询函数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionRequest 请求对象
     * @return SyncInvoker<ShowFunctionRequest, ShowFunctionResponse>
     */
    public SyncInvoker<ShowFunctionRequest, ShowFunctionResponse> showFunctionInvoker(ShowFunctionRequest request) {
        return new SyncInvoker<ShowFunctionRequest, ShowFunctionResponse>(request, LakeFormationMeta.showFunction,
            hcClient);
    }

    /**
     * 修改函数属性
     *
     * 修改函数属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionRequest 请求对象
     * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunction(UpdateFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateFunction);
    }

    /**
     * 修改函数属性
     *
     * 修改函数属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionRequest 请求对象
     * @return SyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse>
     */
    public SyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse> updateFunctionInvoker(
        UpdateFunctionRequest request) {
        return new SyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse>(request, LakeFormationMeta.updateFunction,
            hcClient);
    }

    /**
     * 注册租户协议
     *
     * 用户授权并委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgreementRequest 请求对象
     * @return CreateAgreementResponse
     */
    public CreateAgreementResponse createAgreement(CreateAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createAgreement);
    }

    /**
     * 注册租户协议
     *
     * 用户授权并委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgreementRequest 请求对象
     * @return SyncInvoker<CreateAgreementRequest, CreateAgreementResponse>
     */
    public SyncInvoker<CreateAgreementRequest, CreateAgreementResponse> createAgreementInvoker(
        CreateAgreementRequest request) {
        return new SyncInvoker<CreateAgreementRequest, CreateAgreementResponse>(request,
            LakeFormationMeta.createAgreement, hcClient);
    }

    /**
     * 查询租户是否注册协议
     *
     * 查询租户当前协议和委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRequest 请求对象
     * @return ShowAgreementResponse
     */
    public ShowAgreementResponse showAgreement(ShowAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showAgreement);
    }

    /**
     * 查询租户是否注册协议
     *
     * 查询租户当前协议和委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRequest 请求对象
     * @return SyncInvoker<ShowAgreementRequest, ShowAgreementResponse>
     */
    public SyncInvoker<ShowAgreementRequest, ShowAgreementResponse> showAgreementInvoker(ShowAgreementRequest request) {
        return new SyncInvoker<ShowAgreementRequest, ShowAgreementResponse>(request, LakeFormationMeta.showAgreement,
            hcClient);
    }

    /**
     * 查询当前系统协议
     *
     * 查询当前系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRuleRequest 请求对象
     * @return ShowAgreementRuleResponse
     */
    public ShowAgreementRuleResponse showAgreementRule(ShowAgreementRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showAgreementRule);
    }

    /**
     * 查询当前系统协议
     *
     * 查询当前系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRuleRequest 请求对象
     * @return SyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse>
     */
    public SyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse> showAgreementRuleInvoker(
        ShowAgreementRuleRequest request) {
        return new SyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse>(request,
            LakeFormationMeta.showAgreementRule, hcClient);
    }

    /**
     * 元数据数量统计
     *
     * 元数据数量统计接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountMetaObjRequest 请求对象
     * @return CountMetaObjResponse
     */
    public CountMetaObjResponse countMetaObj(CountMetaObjRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.countMetaObj);
    }

    /**
     * 元数据数量统计
     *
     * 元数据数量统计接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountMetaObjRequest 请求对象
     * @return SyncInvoker<CountMetaObjRequest, CountMetaObjResponse>
     */
    public SyncInvoker<CountMetaObjRequest, CountMetaObjResponse> countMetaObjInvoker(CountMetaObjRequest request) {
        return new SyncInvoker<CountMetaObjRequest, CountMetaObjResponse>(request, LakeFormationMeta.countMetaObj,
            hcClient);
    }

    /**
     * 删除实例
     *
     * 根据实例Id删除LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLakeFormationInstanceRequest 请求对象
     * @return DeleteLakeFormationInstanceResponse
     */
    public DeleteLakeFormationInstanceResponse deleteLakeFormationInstance(DeleteLakeFormationInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteLakeFormationInstance);
    }

    /**
     * 删除实例
     *
     * 根据实例Id删除LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLakeFormationInstanceRequest 请求对象
     * @return SyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse>
     */
    public SyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse> deleteLakeFormationInstanceInvoker(
        DeleteLakeFormationInstanceRequest request) {
        return new SyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse>(request,
            LakeFormationMeta.deleteLakeFormationInstance, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 查询用户创建的实例列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstancesRequest 请求对象
     * @return ListLakeFormationInstancesResponse
     */
    public ListLakeFormationInstancesResponse listLakeFormationInstances(ListLakeFormationInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listLakeFormationInstances);
    }

    /**
     * 查询实例列表
     *
     * 查询用户创建的实例列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstancesRequest 请求对象
     * @return SyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse>
     */
    public SyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse> listLakeFormationInstancesInvoker(
        ListLakeFormationInstancesRequest request) {
        return new SyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse>(request,
            LakeFormationMeta.listLakeFormationInstances, hcClient);
    }

    /**
     * 恢复实例
     *
     * 从回收站恢复LakeFormation实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MoveLakeFormationInstanceOutRecycleBinRequest 请求对象
     * @return MoveLakeFormationInstanceOutRecycleBinResponse
     */
    public MoveLakeFormationInstanceOutRecycleBinResponse moveLakeFormationInstanceOutRecycleBin(
        MoveLakeFormationInstanceOutRecycleBinRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.moveLakeFormationInstanceOutRecycleBin);
    }

    /**
     * 恢复实例
     *
     * 从回收站恢复LakeFormation实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MoveLakeFormationInstanceOutRecycleBinRequest 请求对象
     * @return SyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse>
     */
    public SyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse> moveLakeFormationInstanceOutRecycleBinInvoker(
        MoveLakeFormationInstanceOutRecycleBinRequest request) {
        return new SyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse>(
            request, LakeFormationMeta.moveLakeFormationInstanceOutRecycleBin, hcClient);
    }

    /**
     * 查询实例详情
     *
     * 使用实例Id查询LakeFormation实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLakeFormationInstanceRequest 请求对象
     * @return ShowLakeFormationInstanceResponse
     */
    public ShowLakeFormationInstanceResponse showLakeFormationInstance(ShowLakeFormationInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showLakeFormationInstance);
    }

    /**
     * 查询实例详情
     *
     * 使用实例Id查询LakeFormation实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLakeFormationInstanceRequest 请求对象
     * @return SyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse>
     */
    public SyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse> showLakeFormationInstanceInvoker(
        ShowLakeFormationInstanceRequest request) {
        return new SyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse>(request,
            LakeFormationMeta.showLakeFormationInstance, hcClient);
    }

    /**
     * 更新实例
     *
     * 修改LakeFormation实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceRequest 请求对象
     * @return UpdateLakeFormationInstanceResponse
     */
    public UpdateLakeFormationInstanceResponse updateLakeFormationInstance(UpdateLakeFormationInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateLakeFormationInstance);
    }

    /**
     * 更新实例
     *
     * 修改LakeFormation实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceRequest 请求对象
     * @return SyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse>
     */
    public SyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse> updateLakeFormationInstanceInvoker(
        UpdateLakeFormationInstanceRequest request) {
        return new SyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse>(request,
            LakeFormationMeta.updateLakeFormationInstance, hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketsRequest 请求对象
     * @return ListObsBucketsResponse
     */
    public ListObsBucketsResponse listObsBuckets(ListObsBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listObsBuckets);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketsRequest 请求对象
     * @return SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsInvoker(
        ListObsBucketsRequest request) {
        return new SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>(request, LakeFormationMeta.listObsBuckets,
            hcClient);
    }

    /**
     * 查询obs桶对象列表
     *
     * 查询obs桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsObjectRequest 请求对象
     * @return ListObsObjectResponse
     */
    public ListObsObjectResponse listObsObject(ListObsObjectRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listObsObject);
    }

    /**
     * 查询obs桶对象列表
     *
     * 查询obs桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsObjectRequest 请求对象
     * @return SyncInvoker<ListObsObjectRequest, ListObsObjectResponse>
     */
    public SyncInvoker<ListObsObjectRequest, ListObsObjectResponse> listObsObjectInvoker(ListObsObjectRequest request) {
        return new SyncInvoker<ListObsObjectRequest, ListObsObjectResponse>(request, LakeFormationMeta.listObsObject,
            hcClient);
    }

    /**
     * 批量添加分区信息
     *
     * 批量添加分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPartitionsRequest 请求对象
     * @return AddPartitionsResponse
     */
    public AddPartitionsResponse addPartitions(AddPartitionsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.addPartitions);
    }

    /**
     * 批量添加分区信息
     *
     * 批量添加分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPartitionsRequest 请求对象
     * @return SyncInvoker<AddPartitionsRequest, AddPartitionsResponse>
     */
    public SyncInvoker<AddPartitionsRequest, AddPartitionsResponse> addPartitionsInvoker(AddPartitionsRequest request) {
        return new SyncInvoker<AddPartitionsRequest, AddPartitionsResponse>(request, LakeFormationMeta.addPartitions,
            hcClient);
    }

    /**
     * 批量删除分区信息
     *
     * 非事务表：如果设置删除数据，立刻删除分区数据路径下的数据。
     * 事务表：如果设置删除数据，保留数据在原路径下但对外不可见，待数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionRequest 请求对象
     * @return BatchDeletePartitionResponse
     */
    public BatchDeletePartitionResponse batchDeletePartition(BatchDeletePartitionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchDeletePartition);
    }

    /**
     * 批量删除分区信息
     *
     * 非事务表：如果设置删除数据，立刻删除分区数据路径下的数据。
     * 事务表：如果设置删除数据，保留数据在原路径下但对外不可见，待数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionRequest 请求对象
     * @return SyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse>
     */
    public SyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse> batchDeletePartitionInvoker(
        BatchDeletePartitionRequest request) {
        return new SyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse>(request,
            LakeFormationMeta.batchDeletePartition, hcClient);
    }

    /**
     * 批量清空列表信息
     *
     * 删除存在分区的数据及统计信息，保留分区的元数据信息。全部存在、部分存在或都不存在，均返回OK
     * 非事务表：立刻删除分区路径下的数据。
     * 事务表：数据保留但不可见，待被删除数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionedStatisticsRequest 请求对象
     * @return BatchDeletePartitionedStatisticsResponse
     */
    public BatchDeletePartitionedStatisticsResponse batchDeletePartitionedStatistics(
        BatchDeletePartitionedStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchDeletePartitionedStatistics);
    }

    /**
     * 批量清空列表信息
     *
     * 删除存在分区的数据及统计信息，保留分区的元数据信息。全部存在、部分存在或都不存在，均返回OK
     * 非事务表：立刻删除分区路径下的数据。
     * 事务表：数据保留但不可见，待被删除数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionedStatisticsRequest 请求对象
     * @return SyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse>
     */
    public SyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse> batchDeletePartitionedStatisticsInvoker(
        BatchDeletePartitionedStatisticsRequest request) {
        return new SyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse>(
            request, LakeFormationMeta.batchDeletePartitionedStatistics, hcClient);
    }

    /**
     * 批量获取分区信息
     *
     * 批量获取分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListPartitionByValuesRequest 请求对象
     * @return BatchListPartitionByValuesResponse
     */
    public BatchListPartitionByValuesResponse batchListPartitionByValues(BatchListPartitionByValuesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchListPartitionByValues);
    }

    /**
     * 批量获取分区信息
     *
     * 批量获取分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListPartitionByValuesRequest 请求对象
     * @return SyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse>
     */
    public SyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse> batchListPartitionByValuesInvoker(
        BatchListPartitionByValuesRequest request) {
        return new SyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse>(request,
            LakeFormationMeta.batchListPartitionByValues, hcClient);
    }

    /**
     * 批量修改分区信息
     *
     * 所有partition必须要全部存在，如果存在某个partition不存在，就返回失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdatePartitionRequest 请求对象
     * @return BatchUpdatePartitionResponse
     */
    public BatchUpdatePartitionResponse batchUpdatePartition(BatchUpdatePartitionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchUpdatePartition);
    }

    /**
     * 批量修改分区信息
     *
     * 所有partition必须要全部存在，如果存在某个partition不存在，就返回失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdatePartitionRequest 请求对象
     * @return SyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse>
     */
    public SyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse> batchUpdatePartitionInvoker(
        BatchUpdatePartitionRequest request) {
        return new SyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse>(request,
            LakeFormationMeta.batchUpdatePartition, hcClient);
    }

    /**
     * 列举分区值列表
     *
     * 遍历分区名字列表信息
     * 对于事务表，支持基于表的特定版本遍历分区名字列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesRequest 请求对象
     * @return ListPartitionNamesResponse
     */
    public ListPartitionNamesResponse listPartitionNames(ListPartitionNamesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listPartitionNames);
    }

    /**
     * 列举分区值列表
     *
     * 遍历分区名字列表信息
     * 对于事务表，支持基于表的特定版本遍历分区名字列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesRequest 请求对象
     * @return SyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse>
     */
    public SyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse> listPartitionNamesInvoker(
        ListPartitionNamesRequest request) {
        return new SyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse>(request,
            LakeFormationMeta.listPartitionNames, hcClient);
    }

    /**
     * 列举分区信息
     *
     * 遍历指定数据表下的分区列表，对于事务表，支持基于表的特定版本遍历分区列表。
     * 当过滤条件不为空时，优先根据过滤条件筛选过滤，
     * 当过滤条件为空且分区值不为空时，再根据分区值筛选过滤，
     * 当过滤条件和分区值都为空时，返回指定数据表下所有分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return ListPartitionsResponse
     */
    public ListPartitionsResponse listPartitions(ListPartitionsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listPartitions);
    }

    /**
     * 列举分区信息
     *
     * 遍历指定数据表下的分区列表，对于事务表，支持基于表的特定版本遍历分区列表。
     * 当过滤条件不为空时，优先根据过滤条件筛选过滤，
     * 当过滤条件为空且分区值不为空时，再根据分区值筛选过滤，
     * 当过滤条件和分区值都为空时，返回指定数据表下所有分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return SyncInvoker<ListPartitionsRequest, ListPartitionsResponse>
     */
    public SyncInvoker<ListPartitionsRequest, ListPartitionsResponse> listPartitionsInvoker(
        ListPartitionsRequest request) {
        return new SyncInvoker<ListPartitionsRequest, ListPartitionsResponse>(request, LakeFormationMeta.listPartitions,
            hcClient);
    }

    /**
     * 批量获取分区的列统计信息
     *
     * 批量获取分区的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPartitionColumnStatisticsRequest 请求对象
     * @return BatchShowPartitionColumnStatisticsResponse
     */
    public BatchShowPartitionColumnStatisticsResponse batchShowPartitionColumnStatistics(
        BatchShowPartitionColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchShowPartitionColumnStatistics);
    }

    /**
     * 批量获取分区的列统计信息
     *
     * 批量获取分区的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPartitionColumnStatisticsRequest 请求对象
     * @return SyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse>
     */
    public SyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse> batchShowPartitionColumnStatisticsInvoker(
        BatchShowPartitionColumnStatisticsRequest request) {
        return new SyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse>(
            request, LakeFormationMeta.batchShowPartitionColumnStatistics, hcClient);
    }

    /**
     * 删除分区列的统计信息
     *
     * 删除分区列的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePartitionColumnStatisticsRequest 请求对象
     * @return DeletePartitionColumnStatisticsResponse
     */
    public DeletePartitionColumnStatisticsResponse deletePartitionColumnStatistics(
        DeletePartitionColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deletePartitionColumnStatistics);
    }

    /**
     * 删除分区列的统计信息
     *
     * 删除分区列的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePartitionColumnStatisticsRequest 请求对象
     * @return SyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse>
     */
    public SyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse> deletePartitionColumnStatisticsInvoker(
        DeletePartitionColumnStatisticsRequest request) {
        return new SyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse>(request,
            LakeFormationMeta.deletePartitionColumnStatistics, hcClient);
    }

    /**
     * 批量设置分区的统计信息
     *
     * 批量设置分区的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPartitionColumnStatisticsRequest 请求对象
     * @return SetPartitionColumnStatisticsResponse
     */
    public SetPartitionColumnStatisticsResponse setPartitionColumnStatistics(
        SetPartitionColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.setPartitionColumnStatistics);
    }

    /**
     * 批量设置分区的统计信息
     *
     * 批量设置分区的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPartitionColumnStatisticsRequest 请求对象
     * @return SyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse>
     */
    public SyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse> setPartitionColumnStatisticsInvoker(
        SetPartitionColumnStatisticsRequest request) {
        return new SyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse>(request,
            LakeFormationMeta.setPartitionColumnStatistics, hcClient);
    }

    /**
     * 创建role
     *
     * 创建role
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoleRequest 请求对象
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createRole);
    }

    /**
     * 创建role
     *
     * 创建role
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoleRequest 请求对象
     * @return SyncInvoker<CreateRoleRequest, CreateRoleResponse>
     */
    public SyncInvoker<CreateRoleRequest, CreateRoleResponse> createRoleInvoker(CreateRoleRequest request) {
        return new SyncInvoker<CreateRoleRequest, CreateRoleResponse>(request, LakeFormationMeta.createRole, hcClient);
    }

    /**
     * 删除角色
     *
     * 删除指定角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoleRequest 请求对象
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteRole);
    }

    /**
     * 删除角色
     *
     * 删除指定角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoleRequest 请求对象
     * @return SyncInvoker<DeleteRoleRequest, DeleteRoleResponse>
     */
    public SyncInvoker<DeleteRoleRequest, DeleteRoleResponse> deleteRoleInvoker(DeleteRoleRequest request) {
        return new SyncInvoker<DeleteRoleRequest, DeleteRoleResponse>(request, LakeFormationMeta.deleteRole, hcClient);
    }

    /**
     * 列举所有角色名
     *
     * 查询所有角色名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoleNamesRequest 请求对象
     * @return ListRoleNamesResponse
     */
    public ListRoleNamesResponse listRoleNames(ListRoleNamesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listRoleNames);
    }

    /**
     * 列举所有角色名
     *
     * 查询所有角色名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoleNamesRequest 请求对象
     * @return SyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse>
     */
    public SyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse> listRoleNamesInvoker(ListRoleNamesRequest request) {
        return new SyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse>(request, LakeFormationMeta.listRoleNames,
            hcClient);
    }

    /**
     * 根据条件分页列举角色
     *
     * 返回所有角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRolesRequest 请求对象
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listRoles);
    }

    /**
     * 根据条件分页列举角色
     *
     * 返回所有角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRolesRequest 请求对象
     * @return SyncInvoker<ListRolesRequest, ListRolesResponse>
     */
    public SyncInvoker<ListRolesRequest, ListRolesResponse> listRolesInvoker(ListRolesRequest request) {
        return new SyncInvoker<ListRolesRequest, ListRolesResponse>(request, LakeFormationMeta.listRoles, hcClient);
    }

    /**
     * 获取角色
     *
     * 获取角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoleRequest 请求对象
     * @return ShowRoleResponse
     */
    public ShowRoleResponse showRole(ShowRoleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showRole);
    }

    /**
     * 获取角色
     *
     * 获取角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoleRequest 请求对象
     * @return SyncInvoker<ShowRoleRequest, ShowRoleResponse>
     */
    public SyncInvoker<ShowRoleRequest, ShowRoleResponse> showRoleInvoker(ShowRoleRequest request) {
        return new SyncInvoker<ShowRoleRequest, ShowRoleResponse>(request, LakeFormationMeta.showRole, hcClient);
    }

    /**
     * 修改角色信息
     *
     * 修改角色信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoleRequest 请求对象
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRole(UpdateRoleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateRole);
    }

    /**
     * 修改角色信息
     *
     * 修改角色信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoleRequest 请求对象
     * @return SyncInvoker<UpdateRoleRequest, UpdateRoleResponse>
     */
    public SyncInvoker<UpdateRoleRequest, UpdateRoleResponse> updateRoleInvoker(UpdateRoleRequest request) {
        return new SyncInvoker<UpdateRoleRequest, UpdateRoleResponse>(request, LakeFormationMeta.updateRole, hcClient);
    }

    /**
     * 
     *
     * 查询规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecsRequest 请求对象
     * @return ListSpecsResponse
     */
    public ListSpecsResponse listSpecs(ListSpecsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listSpecs);
    }

    /**
     * 
     *
     * 查询规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecsRequest 请求对象
     * @return SyncInvoker<ListSpecsRequest, ListSpecsResponse>
     */
    public SyncInvoker<ListSpecsRequest, ListSpecsResponse> listSpecsInvoker(ListSpecsRequest request) {
        return new SyncInvoker<ListSpecsRequest, ListSpecsResponse>(request, LakeFormationMeta.listSpecs, hcClient);
    }

    /**
     * 创建表
     *
     * 创建表操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createTable);
    }

    /**
     * 创建表
     *
     * 创建表操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return SyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public SyncInvoker<CreateTableRequest, CreateTableResponse> createTableInvoker(CreateTableRequest request) {
        return new SyncInvoker<CreateTableRequest, CreateTableResponse>(request, LakeFormationMeta.createTable,
            hcClient);
    }

    /**
     * 清空表的数据
     *
     * 清空表以及表下所有分区的数据及统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllTablesRequest 请求对象
     * @return DeleteAllTablesResponse
     */
    public DeleteAllTablesResponse deleteAllTables(DeleteAllTablesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteAllTables);
    }

    /**
     * 清空表的数据
     *
     * 清空表以及表下所有分区的数据及统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllTablesRequest 请求对象
     * @return SyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse>
     */
    public SyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse> deleteAllTablesInvoker(
        DeleteAllTablesRequest request) {
        return new SyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse>(request,
            LakeFormationMeta.deleteAllTables, hcClient);
    }

    /**
     * 删除表
     *
     * 删除表及表下的分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTable(DeleteTableRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteTable);
    }

    /**
     * 删除表
     *
     * 删除表及表下的分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return SyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    public SyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableInvoker(DeleteTableRequest request) {
        return new SyncInvoker<DeleteTableRequest, DeleteTableResponse>(request, LakeFormationMeta.deleteTable,
            hcClient);
    }

    /**
     * 分页获取表的描述信息
     *
     * 通过数据库通配符和表通配符，找到符合条件的表并返回表的描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableMetaRequest 请求对象
     * @return ListTableMetaResponse
     */
    public ListTableMetaResponse listTableMeta(ListTableMetaRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listTableMeta);
    }

    /**
     * 分页获取表的描述信息
     *
     * 通过数据库通配符和表通配符，找到符合条件的表并返回表的描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableMetaRequest 请求对象
     * @return SyncInvoker<ListTableMetaRequest, ListTableMetaResponse>
     */
    public SyncInvoker<ListTableMetaRequest, ListTableMetaResponse> listTableMetaInvoker(ListTableMetaRequest request) {
        return new SyncInvoker<ListTableMetaRequest, ListTableMetaResponse>(request, LakeFormationMeta.listTableMeta,
            hcClient);
    }

    /**
     * 列举库下所有表名
     *
     * 查询数据库下的所有表名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableNamesRequest 请求对象
     * @return ListTableNamesResponse
     */
    public ListTableNamesResponse listTableNames(ListTableNamesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listTableNames);
    }

    /**
     * 列举库下所有表名
     *
     * 查询数据库下的所有表名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableNamesRequest 请求对象
     * @return SyncInvoker<ListTableNamesRequest, ListTableNamesResponse>
     */
    public SyncInvoker<ListTableNamesRequest, ListTableNamesResponse> listTableNamesInvoker(
        ListTableNamesRequest request) {
        return new SyncInvoker<ListTableNamesRequest, ListTableNamesResponse>(request, LakeFormationMeta.listTableNames,
            hcClient);
    }

    /**
     * 根据条件分页列举表信息
     *
     * 返回数据库下符合查询条件的表的元数据信息，不支持事务操作
     * 当表名通配符或表类型不为空时，优先根据表名和类型筛选过滤
     * 当表名通配符或表类型为空时，再根据属性筛选过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listTables);
    }

    /**
     * 根据条件分页列举表信息
     *
     * 返回数据库下符合查询条件的表的元数据信息，不支持事务操作
     * 当表名通配符或表类型不为空时，优先根据表名和类型筛选过滤
     * 当表名通配符或表类型为空时，再根据属性筛选过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return SyncInvoker<ListTablesRequest, ListTablesResponse>
     */
    public SyncInvoker<ListTablesRequest, ListTablesResponse> listTablesInvoker(ListTablesRequest request) {
        return new SyncInvoker<ListTablesRequest, ListTablesResponse>(request, LakeFormationMeta.listTables, hcClient);
    }

    /**
     * 根据表名列举表信息
     *
     * 根据表名查询数据库下的表信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesByNameRequest 请求对象
     * @return ListTablesByNameResponse
     */
    public ListTablesByNameResponse listTablesByName(ListTablesByNameRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listTablesByName);
    }

    /**
     * 根据表名列举表信息
     *
     * 根据表名查询数据库下的表信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesByNameRequest 请求对象
     * @return SyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse>
     */
    public SyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse> listTablesByNameInvoker(
        ListTablesByNameRequest request) {
        return new SyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse>(request,
            LakeFormationMeta.listTablesByName, hcClient);
    }

    /**
     * 获取表信息
     *
     * 获取表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableRequest 请求对象
     * @return ShowTableResponse
     */
    public ShowTableResponse showTable(ShowTableRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showTable);
    }

    /**
     * 获取表信息
     *
     * 获取表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableRequest 请求对象
     * @return SyncInvoker<ShowTableRequest, ShowTableResponse>
     */
    public SyncInvoker<ShowTableRequest, ShowTableResponse> showTableInvoker(ShowTableRequest request) {
        return new SyncInvoker<ShowTableRequest, ShowTableResponse>(request, LakeFormationMeta.showTable, hcClient);
    }

    /**
     * 修改表信息
     *
     * 修改表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableRequest 请求对象
     * @return UpdateTableResponse
     */
    public UpdateTableResponse updateTable(UpdateTableRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateTable);
    }

    /**
     * 修改表信息
     *
     * 修改表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableRequest 请求对象
     * @return SyncInvoker<UpdateTableRequest, UpdateTableResponse>
     */
    public SyncInvoker<UpdateTableRequest, UpdateTableResponse> updateTableInvoker(UpdateTableRequest request) {
        return new SyncInvoker<UpdateTableRequest, UpdateTableResponse>(request, LakeFormationMeta.updateTable,
            hcClient);
    }

    /**
     * 删除表的指定列统计信息
     *
     * 删除表的指定列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableColumnStatisticsRequest 请求对象
     * @return DeleteTableColumnStatisticsResponse
     */
    public DeleteTableColumnStatisticsResponse deleteTableColumnStatistics(DeleteTableColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteTableColumnStatistics);
    }

    /**
     * 删除表的指定列统计信息
     *
     * 删除表的指定列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableColumnStatisticsRequest 请求对象
     * @return SyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse>
     */
    public SyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse> deleteTableColumnStatisticsInvoker(
        DeleteTableColumnStatisticsRequest request) {
        return new SyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse>(request,
            LakeFormationMeta.deleteTableColumnStatistics, hcClient);
    }

    /**
     * 获取表的列统计信息
     *
     * 获取表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableColumnStatisticsRequest 请求对象
     * @return ListTableColumnStatisticsResponse
     */
    public ListTableColumnStatisticsResponse listTableColumnStatistics(ListTableColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listTableColumnStatistics);
    }

    /**
     * 获取表的列统计信息
     *
     * 获取表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableColumnStatisticsRequest 请求对象
     * @return SyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse>
     */
    public SyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse> listTableColumnStatisticsInvoker(
        ListTableColumnStatisticsRequest request) {
        return new SyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse>(request,
            LakeFormationMeta.listTableColumnStatistics, hcClient);
    }

    /**
     * 更新表的列统计信息
     *
     * 更新表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetTableColumnStatisticsRequest 请求对象
     * @return SetTableColumnStatisticsResponse
     */
    public SetTableColumnStatisticsResponse setTableColumnStatistics(SetTableColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.setTableColumnStatistics);
    }

    /**
     * 更新表的列统计信息
     *
     * 更新表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetTableColumnStatisticsRequest 请求对象
     * @return SyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse>
     */
    public SyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse> setTableColumnStatisticsInvoker(
        SetTableColumnStatisticsRequest request) {
        return new SyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse>(request,
            LakeFormationMeta.setTableColumnStatistics, hcClient);
    }

    /**
     * 批量创建列限制条件
     *
     * 批量创建表的列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateConstraintRequest 请求对象
     * @return BatchCreateConstraintResponse
     */
    public BatchCreateConstraintResponse batchCreateConstraint(BatchCreateConstraintRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchCreateConstraint);
    }

    /**
     * 批量创建列限制条件
     *
     * 批量创建表的列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateConstraintRequest 请求对象
     * @return SyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse>
     */
    public SyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse> batchCreateConstraintInvoker(
        BatchCreateConstraintRequest request) {
        return new SyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse>(request,
            LakeFormationMeta.batchCreateConstraint, hcClient);
    }

    /**
     * 删除列限制条件
     *
     * 删除列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConstraintRequest 请求对象
     * @return DeleteConstraintResponse
     */
    public DeleteConstraintResponse deleteConstraint(DeleteConstraintRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteConstraint);
    }

    /**
     * 删除列限制条件
     *
     * 删除列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConstraintRequest 请求对象
     * @return SyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse>
     */
    public SyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse> deleteConstraintInvoker(
        DeleteConstraintRequest request) {
        return new SyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse>(request,
            LakeFormationMeta.deleteConstraint, hcClient);
    }

    /**
     * 获取列限制条件
     *
     * 若查询外键信息，需要在参数中填写被引用表的数据库名和表名。如：parent_db&#x3D;db1&amp;parent_tbl&#x3D;tbl1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConstraintsRequest 请求对象
     * @return ListConstraintsResponse
     */
    public ListConstraintsResponse listConstraints(ListConstraintsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listConstraints);
    }

    /**
     * 获取列限制条件
     *
     * 若查询外键信息，需要在参数中填写被引用表的数据库名和表名。如：parent_db&#x3D;db1&amp;parent_tbl&#x3D;tbl1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConstraintsRequest 请求对象
     * @return SyncInvoker<ListConstraintsRequest, ListConstraintsResponse>
     */
    public SyncInvoker<ListConstraintsRequest, ListConstraintsResponse> listConstraintsInvoker(
        ListConstraintsRequest request) {
        return new SyncInvoker<ListConstraintsRequest, ListConstraintsResponse>(request,
            LakeFormationMeta.listConstraints, hcClient);
    }

    /**
     * 获取租户的用户组
     *
     * 获取租户的用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsForDomainRequest 请求对象
     * @return ListGroupsForDomainResponse
     */
    public ListGroupsForDomainResponse listGroupsForDomain(ListGroupsForDomainRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listGroupsForDomain);
    }

    /**
     * 获取租户的用户组
     *
     * 获取租户的用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsForDomainRequest 请求对象
     * @return SyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse>
     */
    public SyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse> listGroupsForDomainInvoker(
        ListGroupsForDomainRequest request) {
        return new SyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse>(request,
            LakeFormationMeta.listGroupsForDomain, hcClient);
    }

}
