FROM node:20-alpine

WORKDIR /app

COPY package.json package-lock.json /app/

RUN npm install

COPY /src /app

COPY /index.html /app

COPY /.eslint.cjs /app

COPY /README.md /app

COPY /tsconfig.json /app

COPY /tsconfig.node.json /app

COPY /vite.config.ts /app

RUN npm run build

EXPOSE 80

CMD ["npm", "start"]