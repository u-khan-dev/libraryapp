FROM node:20-alpine

WORKDIR /app

COPY package.json package-lock.json /app/

RUN npm install

COPY /src /app/src

COPY /index.html /app

COPY /.eslintrc.cjs /app

COPY /README.md /app

COPY /tsconfig.json /app

COPY /tsconfig.node.json /app

COPY /vite.config.ts /app

RUN npm run build

EXPOSE 5173

CMD ["npm", "start"]