db.createUser(
    {
        user: "edyesid",
        pwd: "edwin123",
        roles: [
            {
                role: "readWrite",
                db: "AREP-DB"
            }
        ]
    }
)