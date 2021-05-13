const proxy = [{
    context: '^/api',
    pathRewrite: {'^/api':''}
}];

export default proxy;