SELECT products.name, providers.name
FROM products INNER JOIN providers
ON products.id_providers = providers.id where products.id_categories = 6;