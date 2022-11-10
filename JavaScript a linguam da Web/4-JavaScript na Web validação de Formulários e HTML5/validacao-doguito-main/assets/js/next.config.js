module.exports = {
    async headers() {
        return [
            {
                //Matching all API routes
                source: '/:path*', //todas as rotas da aplicação
                headers: [
                    {key: 'Access-Control-Allow-Credentials', value: 'true'},
                    {key: 'Access-Control-Allow-Origin', value: '*'},
                    {key: 'Access-Control-Allow-Methods', value: 'GET,OPTIONS,PATCH,DELETE,POST,PUT'}
                   // {key: 'Access-Control-Allow-Headers', value: 'X-CSRF-Token', Accept, Accept-Encoding, Authorization, Cache-Control, Content-Encoding, Content-MD5, Content-Type, Effective-Of, If-Match, If-None-Match, Metadata-Context, Origin, Prefer, REST-Framework-Version, REST-Pretty-Print, Upsert-Mode, User-Agent, X-HTTP-Method-Override, X-Requested-By.}
                ]
            }
        ]
    }

}